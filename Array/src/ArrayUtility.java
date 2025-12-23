import java.util.Scanner;

public class ArrayUtility {
    public static int[] array(){

        Scanner Input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int size = Input.nextInt();
        int[] newArray = new int[size];

        int i = 0;
        while (i < size){
            System.out.print("Enter the number you want to put on position no "+(i + 1)+" : ");
            newArray[i] = Input.nextInt();
            i++;
        }
        return newArray;
    }
}
