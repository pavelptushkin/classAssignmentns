import java.util.ArrayList;

public class StringBuilder {
    public static void main(String[] args) {
        String str = "Hello World";
        ArrayList<Character> charArray = new ArrayList<>();
        for (char s: str.toCharArray()) {
            if (s != ' '){
                charArray.add('*');
            }
            else charArray.add(s);

        }
        System.out.println(charArray);
    }
}
