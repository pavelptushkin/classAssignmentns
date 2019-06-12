import wheel.Player;
import wheel.Wheel;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WheelOfFortune {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String puzzle;
        int menuOption = 5;
        Wheel wheel = new Wheel();
//        System.out.println("How many players are in this game");
//        int numPlayers = input.nextInt();
//        for (int i = 0; i < numPlayers; i++) {
//            System.out.println("Please enter a player name");
//            players.add(new Player(input.next()));
//        }
//        System.out.println(players.get(0).getPlayerName());
        wheel.setPuzzle();
//        System.out.println("Puzzle hint" + wheel.getPuzzleHint());
//        System.out.println("Puzzle answer: " + wheel.getPuzzleAnswer());
        System.out.println(wheel.createHiddenPuzzle());
//        System.out.println(wheel.revealLetters('t'));
//        System.out.println(wheel.revealLetters('h'));
//        System.out.println(wheel.revealLetters('g'));
        String playerSolution;
        while (wheel.getHiddenPuzzle().contains("*"))
        {
            if (menuOption < 4 || menuOption > 4) {
                System.out.println("Please Select Your Option");
                System.out.println("0 to quit the game");
                System.out.println("1 to solve the whole puzzle");
                System.out.println("2 to spin the wheel and guess a consonants");
                System.out.println("3 to buy a vowel");
                System.out.println("The Puzzle Is " + wheel.getHiddenPuzzle());

                menuOption = tryCatchInt();                if (menuOption == 0) wheel.quitGame();
                else if (menuOption == 1){
                    System.out.println("What is your solution for the puzzle?");
                    playerSolution = input.nextLine();
                    if (wheel.solvePuzzle(playerSolution.toUpperCase()) == true){
                        System.out.println("You got it");
                        break;
                    }
                    else System.out.println("You got it wrong");
                }
                else if (menuOption == 2){
                    System.out.println("What consonant would you like to guess");
                    wheel.revealLetters(tryCatchStrCons());
                }
                else if (menuOption == 3){
                    System.out.println("Which vowel would you like to buy");
                    wheel.revealLetters(tryCatchStrVow());
                }
                else menuOption = 6;
            }
        }

    }

    public static char tryCatchStrCons(){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while(true)
        {
            try
            {
                answer = scanner.next("([^aeiouyAEIOUY0-9\\W]+)");
                scanner.nextLine();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Input cannot be an integer and a vowel try again.");
                scanner.nextLine();
            }

        }
        return answer.toUpperCase().charAt(0);
    }

    public static char tryCatchStrVow(){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while(true)
        {
            try
            {
                answer = scanner.next("^([aeiouyAEIOUY]+)$");
                scanner.nextLine();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Input cannot be an integer and a vowel try again.");
                scanner.nextLine();
            }

        }
        return answer.toUpperCase().charAt(0);
    }

    public static int tryCatchInt()
    {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while(true)
        {
            try
            {
                answer = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Looking for an integer try again.");
                scanner.nextLine();
            }

        }
        return answer;
    }


}
