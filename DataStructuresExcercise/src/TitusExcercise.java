import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TitusExcercise {
    public static void main (String[] args){
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

//        HashMap<String, Integer> person = new HashMap<>();
//        person.put("Joan", 21);
//        person.put("Anna", 34);
//        person.put("Mike", 55);
//        person.put("Daniel", 42);
//        System.out.println(person);
//        System.out.println(person.keySet());
//        System.out.println(person.values());
        HashMap<String, Integer> person = new HashMap<>();
        person.put("Name", 18);

//        for (Map.Entry<String, Integer> entry : person.entrySet()){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + ":" + value);
//        }


    }
}
