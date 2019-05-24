import java.util.*;

public class AsciiChars {
    public static int printNumbersAndLetters()
    {
        for (int i = 48; i <= 57 ; i++){
            System.out.print((char)i + " ");
        }
        return 97;

    }

    public static int printLowerCase(int num)
    {
        for (; num <= 122 ; num++){
            System.out.print((char)num + " ");
        }
        return 65;
    }

    public static void printUpperCase(int num)
    {
        for (; num <= 90 ; num++){
            System.out.print((char)num + " ");
        }
    }

    public static String askName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter your name ");     // type a word and hit enter
        String userName = scanner.next();
        System.out.println(String.format("Hello %s", userName ));
        System.out.println("Would you like to answer some questions? Y/N");
        String answer = scanner.next();
        return answer;
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
    public static String tryCatchStr(){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while(true)
        {
            try
            {
                answer = scanner.next("[a-zA-Z]*");
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Input cannot be an integer, try again.");
                scanner.nextLine();
            }

        }
        return answer;
    }

    public static void askQuestions(String s)
    {
        Random rnd = new Random();
        int[] rndNumbers = new int[3];
        int[] luckyNumbers = new int[6];
        for (int i = 0; i < rndNumbers.length; i++)
        {
            rndNumbers[i] = rnd.nextInt((30)+1);
        }
        Scanner scanner = new Scanner(System.in);
        if (s.toLowerCase().charAt(0) == 'y') {
            while (s.toLowerCase().charAt(0) == 'y') {
                System.out.println("Do you have a red car? Y/N");     // type a word and hit enter
                String userCity = tryCatchStr();
                System.out.println("What is the name of your favorite pet? ");
                String userPetName = tryCatchStr();
                luckyNumbers[0] = (int)userPetName.toLowerCase().charAt(2);
                luckyNumbers[1] = 42;
                System.out.println("What is the age of your favorite pet?");
                int userPetAge = tryCatchInt();
                System.out.println("What is your lucky number?");
                int userLuckyNumber = tryCatchInt();
                System.out.println("Do you have a favorite quarterback? If so what is their jersey number?");
                int userQbNumber = tryCatchInt();
                System.out.println("What is the two digit model of your car?");
                int userCarModel = tryCatchInt();
                luckyNumbers[2] = userPetAge + userCarModel;
                System.out.println("What is the first name of your favorite actor or actress?");
                String userActor = tryCatchStr();
                luckyNumbers[3] = (int)userActor.toLowerCase().charAt(0);
                System.out.println("Enter a random number between 1 and 50");
                int userRnd = tryCatchInt();
                if (rndNumbers[1] > userRnd)
                luckyNumbers[4] = rndNumbers[1] - userRnd;
                else luckyNumbers[4] = userRnd - rndNumbers[1];
                luckyNumbers[5] = userQbNumber * rndNumbers[0];
                while (luckyNumbers[5] > 75) luckyNumbers[5] -= 75;
                Arrays.sort(luckyNumbers,0 , 5 );
                for (int i = 0; i < luckyNumbers.length - 1; i ++)
                {
                    if (luckyNumbers[i] > 65) luckyNumbers[i] -= 65;
                    System.out.print(luckyNumbers[i] + " ");
                }
                System.out.print("Magic ball is " + luckyNumbers[luckyNumbers.length - 1]);
                System.out.println("\nWould you like to answer these questions again? Y/N");
                s = scanner.next();
            }

        }
        else System.out.println("Please return later to complete the survey later");
    }
}

