import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Input element no "+(i+1)+" : " );
            array[i] = Input.nextInt();
            i++;
        }
        reverseArray(array);
        System.out.print("The reversed array is: ");
        int j = 0;
        while (j< array.length){
            System.out.print(array[j]+" ");
            j++;
        }
    }

    public static int[] reverseArray(int[] array){
        int i = 0;
        int j = array.length - 1;
        while (i < j){
            int c = array[i];
            array[i] = array[j];
            array[j] = c;
            i++;
            j--;
        }
        return array;
    }
}
