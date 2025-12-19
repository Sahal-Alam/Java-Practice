import java.util.Arrays;
import java.util.Scanner;

class CopyElements {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element no "+(i+1)+" : ");
            array[i] = Input.nextInt();
            i++;
        }
        System.out.println("The new array is: "+Arrays.toString(newArray(array, size)));
    }
    public static int[] newArray(int[] array , int size){
        int[] newArray = new int[size];
        int i = 0 , j = 0;
        while (i < array.length){
            if (j < newArray.length){
                newArray[j] = array[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}
