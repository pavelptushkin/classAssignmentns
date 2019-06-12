public class SortingAlg {
        public static void sort(int numbers[])
        {
            for (int i = 0; i < numbers.length - 1; i++)
            {
                int lowest = i;
                for (int j = i+1; j < numbers.length; j++)
                    if (numbers[j] < numbers[lowest]) lowest = j;
                int num = numbers[lowest];
                numbers[lowest] = numbers[i];
                numbers[i] = num;
            }
        }

        public static void printArray(int numbers[])
        {
            for (int i=0; i<numbers.length; ++i)
                System.out.print(numbers[i]+" ");
            System.out.println();
        }

        public static void main(String args[])
        {
            SortingAlg sorting = new SortingAlg();
            int numbers[] = new int[100];
            for(int i = 0; i < numbers.length ; i++){
                numbers[i] = (int) (Math.random() * 100);
            }
            sorting.sort(numbers);
            System.out.println("Sorted numbersay");
            printArray(numbers);
        }
}
