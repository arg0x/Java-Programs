import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallestFrom = startIndex;
        int smallest = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                indexOfSmallestFrom = i;
            }
        }
        return indexOfSmallestFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }

    }

    public static void main(String[] args) {
        // write your test code here

        // int[] array = { 3, 1, 5, 99, 3, 12 };

        // part 1
        // int[] numbers = { 6, 5, 8, 7, 11 };
        // System.out.println("Smallest: " + MainProgram.smallest(numbers));

        // part 2
        // int[] numbers = { 6, 5, 8, 7, 11 };
        // System.out.println("Index of the smallest number: " +
        // MainProgram.indexOfSmallest(numbers));

        // part 3
        // int[] numbers = { -1, 6, 9, 8, 12 };
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        // part 4
        // int[] numbers = { 4, 7, 8, 6 };

        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 0, 3);
        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 0, 3);
        // System.out.println(Arrays.toString(numbers));

        // part 5
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

}
