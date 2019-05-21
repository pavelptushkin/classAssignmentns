import java.util.Scanner;

public class MainFile
{

    public static void main(String args[])
    {
        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);
        String employment;
        String car;
        do {
            // prompt and read a string
            System.out.print("Enter your name: ");
            String username = scanner.next();

            // prompt and read an int
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("For Employment Enter E(Employed),U(Unemployed,S(Student): ");
            employment = scanner.next();

            System.out.print("Do you have a car, truck, suv, or do not own a vehicle? Enter C(Car), T(Truck), S(SUV), N(None of the above) ");
            car = scanner.next();

            System.out.println(String.format("Hello %s, your age is %d", username, age));

            if (age >= 16) {
                System.out.println("You are old enough to drive");
            } else System.out.println("You are not old enough to drive");

            if (age >= 18) {
                System.out.println("You are old enough to vote");
            } else System.out.println("You are not old enough to vote");

            if (age >= 21) {
                System.out.println("You are old enough to drink");
            } else System.out.println("You are not old enough to drink");

            if (age >= 35) {
                System.out.println("You are old enough to be President");
            } else System.out.println("You are not old enough to be President");

            if (age >= 55) {
                System.out.println("You can join AARP");
            } else System.out.println("You cant join AARP");

            if (age >= 67) {
                System.out.println("You can start drawing Social Security");
            } else System.out.println("You cant start drawing Social Security");
            System.out.print("Would you like to repeat the process answer Y(Yes),N(No)");
        }

        while (scanner.next().toLowerCase().charAt(0) == 'y');

        switch (employment.toLowerCase()){
            case "e":
                System.out.println("You are employed");
            break;
            case "u":
                System.out.println("You are unemployed");
            break;
            case "s":
                System.out.println("You are a student");
            break;
            default:
                System.out.println("Wrong Employment Option");
            break;
        }

        switch (car.toLowerCase()){
            case "c":
                System.out.println("You own a car");
                break;
            case "t":
                System.out.println("You own a truck");
                break;
            case "s":
                System.out.println("You own an SUV");
                break;
            case "n":
                System.out.println("You dont own a car");
                break;
        }

        System.out.println("Lab Part 3");

        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length; i++) myArray[i] = i;

        for (int item : myArray) System.out.println(item);
        int n = 2;
        for (int i = 0; i < myArray.length; i++ ) {
            myArray[i] = n;
            n += 2;
        }

        for (int item : myArray) System.out.println(item);

        for(int i=myArray.length - 1; i >= 0;i--)System.out.println(myArray[i]);

        System.out.println("Lab Part 4");
        int i = 0;
        while ( i < myArray.length){
            System.out.println(myArray[i]);
            i++;
        }
        i = myArray.length - 1;
        while (i >= 0){
            System.out.println(myArray[i]);
            i--;
        }
        System.out.println("Total Sum of the even numbers is " + arrayMethod(20));

    }

    public static int arrayMethod(int num){
        int[] myArray = new int[30];
        int evenSum = 0;

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i;
        }
        for (int i = 0; i < myArray.length; i++){
            if (i == num){
                break;
            }
            else if (i%2 == 0){
                evenSum += i;
            }
            else System.out.println(myArray[i]);
        }
        return evenSum;

    }

}