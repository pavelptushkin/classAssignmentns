import java.lang.Integer;

public class General {
    public static void main (String[] args){
        int firstInt = 6;
        int secondInt = 20;
        int thirdInt = 0;
        float noName = 4.4f;
        boolean isCold = false;
        double test = 100_000_000_000.00;
        System.out.println("Part 1");
        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(noName);
        System.out.println(isCold);
        System.out.println(test);
        System.out.println("Part 2");
        int newValue = secondInt + firstInt;
        System.out.println(newValue);
        newValue = thirdInt + firstInt;
        // third int is not initialized so we initialize it to 0
        System.out.println(newValue);
        System.out.println((double)secondInt/firstInt);
        System.out.println(secondInt%firstInt);
        int remInt = (secondInt%firstInt)+firstInt;
        System.out.println(++remInt);
        System.out.println("Part 3");
        int x = 100;
        boolean tRue = (x == 100);
        int y = 106;
        System.out.println(x>y);
        System.out.println(y>x);
        System.out.println(x >= (y-6));
        int z = 62;
        System.out.println(x<y && y < z);
        System.out.println(y<z && x >= y);
        System.out.println(z > (y+x) || (x - y) < z);
        System.out.println(x<y == !(x>y));
        System.out.println("Part 4");
        int n = 64;
        System.out.println((n>>1) == (n/2));
        System.out.println((n<<1) == (n*2));
        n = 40;
        System.out.println((n>>1) == (n/2));
        System.out.println((n<<1) == (n*2));
        System.out.println((n>>2) == (n/4) && ((n<<2) == (n*4)));
        n = 39;
        System.out.println((n>>2) == (n/4) && ((n<<2) == (n*4)));
        System.out.println("Part 5");
        System.out.println("No the variable cannot be accessed");
        anotherMethod();
        System.out.println("Part 6");
        playWithStrings();

    }
    public static void anotherMethod()
    {
        Integer n = Integer.valueOf(500);
        Integer cond = Integer.valueOf("1000");
        int result = Integer.compare(n, cond);
        System.out.println(result);
        if (result >= 0){
            System.out.println(n + " is a Big Value");
            int n1 = n/2;
            System.out.println(n1 + " Is half the size of the Big Value");
        }
        else{
            System.out.println(n + " Is Not a big Value");
            System.out.println("Half value wont work here because the scope of that variable is in the if statement");
        }
    }

    public static void playWithStrings(){
        String firstName = "Pavlo";
        String lastName = String.valueOf("Ptushkin");
        System.out.println("Hello ".concat(firstName).concat(" ").concat(lastName));
        System.out.println("Hello " + firstName + " " + lastName);
        String fullName = String.valueOf(firstName.concat(" ").concat(lastName));
        System.out.println(String.format("We will be working with %s",fullName));
        System.out.println(String.format("The total length of the string %s is %d",fullName, fullName.length()));
        System.out.println(String.format("Index of the first 'o' is %d",fullName.indexOf("o")));
        System.out.println(String.format("Letter at Position 7 is %s",fullName.charAt(7)));
        System.out.println(String.format("Does it contain \"son\": %b",fullName.contains("son")));
        System.out.println(String.format("Last 4 letters of this string is: %s", fullName.substring(fullName.length() - 5)));
        System.out.println(String.format("Does the name contain an \' or a -: %b",(fullName.contains("'") || fullName.contains("-"))));

    }
}
