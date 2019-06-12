public class Random {
    static int countBits(int oo)
    {
        int O[] = new int[oo+2];
        O[0] = 0;
        O[1] = 1;
        for (int o = 2; o <= oo; o++)
        {
            O[o] = O[o-1] + O[o-2];
        }
        return O[oo];
    }
    public static void main (String args[])
    {
        System.out.println(countBits(2000000));
    }

}
