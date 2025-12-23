import java.util.Scanner;

public class ArraySort {
    static void main(String[] args) {
        System.out.println("Welcome to the sorted Array.\n");

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element no " + (i + 1) + " : ");
            array[i] = Input.nextInt();
            i++;
        }
//        int value = 0;
        int j = 0;
        while (j < array.length) {
            if (array[array.length-1] >= array[j]) {
                System.out.println(array[array.length-1]);
            }else {
                System.out.println("The array is not sorted.");
            }
            j++;
        }
    }
}
