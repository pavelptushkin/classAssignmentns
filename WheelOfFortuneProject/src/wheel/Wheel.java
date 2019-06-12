package wheel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Wheel {
    public ArrayList<String> puzzles = new ArrayList<>();
    public ArrayList<Integer> wheelWedges = new ArrayList<>();
    Random rnd = new Random();
    String puzzleHint;
    String puzzleAnswer;
    String hiddenPuzzle;

    public String getHiddenPuzzle() {
        return hiddenPuzzle;
    }

    public Wheel(){
        loadPuzzles();
        loadWedges();
    }

    public void setPuzzle(){
        String str = randomPuzzleValue();
        String [] arrOfStr = str.split(":");
        this.puzzleHint = arrOfStr[0];
        this.puzzleAnswer = arrOfStr[1];
    }

    public String getPuzzleHint(){
        return puzzleHint;
    }

    public String getPuzzleAnswer(){
        return puzzleAnswer;
    }

    public int spinWheel(){
        return wheelWedges.get(rnd.nextInt(wheelWedges.size()));
    }

    public String randomPuzzleValue(){
        return puzzles.get(rnd.nextInt(puzzles.size() -1)+1);
    }

    public void loadWedges(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the file for the wheel values");
        String filename = input.next();
        System.out.println(filename);
        ArrayList<String> tempArr = new ArrayList<>();
        try
        {
            loadStringsToArray(filename, tempArr);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the values");
            // make sure it is empty
            this.puzzles = new ArrayList<>();

        }
        for (String i : tempArr){
         wheelWedges.add(Integer.parseInt(i));
        }
    }

    public static void loadStringsToArray(String filename, ArrayList<String> arrList) throws IOException
    {
        Path path = Paths.get(filename);
        arrList.clear();

        // The stream file will also be closed here
        try (Stream<String> lines = Files.lines(path))
        {
            Object[] arr = lines.toArray();

            for(Object t: arr)
            {
                arrList.add(t.toString().toUpperCase());
            }
        }
    }
    private void loadPuzzles()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the file for the puzzles");
        String filename = input.next();
        System.out.println(filename);
        try
        {
            loadStringsToArray(filename, this.puzzles);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the puzzles");
            // make sure it is empty
            this.puzzles = new ArrayList<>();
        }
    }

    public String createHiddenPuzzle(){
        StringBuilder str = new StringBuilder();
        str.append(getPuzzleAnswer());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                str.setCharAt(i, '*');
            }
        }
        this.hiddenPuzzle = str.toString();
        return str.toString();
    }
    public int checkStringForLetter(String puzzle,char userInput){
        String puzzle1 = puzzle;
        int count = 0;
        for (int i = 0; i < puzzle1.length() ; i++) {
            if (puzzle1.charAt(i) == userInput){
                count++;
            }
        }
        return count;
    }

    public StringBuilder revealLetters(char input){
        String puzzle = getPuzzleAnswer();
        StringBuilder str = new StringBuilder();
        str.append(hiddenPuzzle);
        for (int i = 0; i < puzzle.length(); i++) {
            if (puzzle.charAt(i) == input){
                str.setCharAt(i, input);
                System.out.println("Revealed letter " + input);
            }
        }
        if (checkStringForLetter(puzzle, input) == 0) System.out.println("There is no " + input + " in the puzzle");
        this.hiddenPuzzle = str.toString();
        return str;
    }

    public void quitGame(){
        System.out.println("Quitting The Game");
        System.exit(1);
    }

    public Boolean solvePuzzle(String input){
        if (input.equals(getPuzzleAnswer()) == true){
            return true;
        }
        return false;
    }

}
