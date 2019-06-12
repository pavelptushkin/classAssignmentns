public class IntegerToBinary {
    public static int countBits(Integer n){
        String num = Integer.toBinaryString(n);
        int j = 0;
        for (int i = 0; i < num.length(); i++){
            if (num.charAt(i) == '1') j++;
        }
        return j;
    }
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
