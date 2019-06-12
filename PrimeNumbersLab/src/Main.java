public class Main {
    public static String isPrime(int num) {
        for (int i = 2; i < (int)(Math.sqrt(num))+1; i++) {
            if (num % i == 0)
            {
                return " is not a Prime number";
            }
        }
        return " is a Prime number";
    }

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i == 1) System.out.println(i + " is not a Prime number");
            else System.out.println(i + isPrime(i));
        }

    }
}
