import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> nameArray = new ArrayList<>();
        nameArray.add(7);

        for (int i = 0; i < 400000; i++){
            nameArray.add(i);
        }

        System.out.println(nameArray.size());
        System.out.println(nameArray.get(2000));


    }
}
