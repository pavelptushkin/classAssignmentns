import java.util.HashMap;

public class example1 {
    public static void main (String[] args){
        HashMap<String, Integer> person = new HashMap<>();
        person.put("Joan", 21);
        person.put("Anna", 34);
        person.put("Mike", 55);
        person.put("Daniel", 42);
        System.out.println(person);
        System.out.println(person.keySet());
        System.out.println(person.values());
    }
}
