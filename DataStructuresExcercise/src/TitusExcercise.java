import java.util.*;

public class TitusExcercise {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("cow");
        animals.add("tiger");
        animals.add("lion");
        animals.add("zebra");
        String favorite = "tiger";

        for (String s : animals) System.out.print(s + " ");
        if (animals.contains(favorite)) System.out.println(String.format("\nI love %s", favorite));
        else System.out.println("No, I dont care about those");


        System.out.println("What is your name");
        String name = scanner.next();
        System.out.println("What is your age");
        String age = scanner.next();
        System.out.println("What is the name of your hometown");
        String hometown = scanner.next();
        System.out.println("Whats your favorite food");
        String food = scanner.next();

        HashMap<String, String> person = new HashMap<>();
        person.put("Name", name);
        person.put("Age", age);
        person.put("Hometown", hometown);
        person.put("Food", food);

        System.out.println("This is " + person.get("Name"));
        System.out.println("They are " + person.get("Age") + " old");
        System.out.println("from " + person.get("Hometown"));
        System.out.println("and their favorite food is " + person.get("Food"));


        ArrayList<Integer> arr = new ArrayList<>(5);
        int sum =0;
        long product = 1;


        for (int i = 0; arr.size() < 5; i++){
            System.out.println("Please enter the integer for index " + i);
            arr.add(scanner.nextInt());
        }

        for (int i : arr) System.out.print(i + " ");

        for (int i = 0; i < arr.size(); i++)
        {
            sum += arr.get(i);
            product *= arr.get(i);
        }
        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
        System.out.println("Smallest is " + Collections.min(arr));
        System.out.println("Largest is " + Collections.max(arr));


        HashMap<String, String> car = new HashMap<>();
        car.put("Altima", "Nissan");
        car.put("Maxima", "Nissan");
        car.put("Armada", "Nissan");
        car.put("Rogue", "Nissan");

        System.out.println("Please enter the model of the car you are looking for");
        String input = scanner.next();
        if (car.containsKey(input)) System.out.println("We have " + input + " by " + car.get(input));
        else System.out.println("We dont have that car");
    }
}
