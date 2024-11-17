public class ArraySum
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] SumArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            SumArray[i] = array1[i] + array2[i];
        }

        System.out.println("Sum of the Array:");
        for (int i = (SumArray.length - 1); i >= 0; i--) {
            System.out.print(SumArray[i] + " ");
        }
    }
}