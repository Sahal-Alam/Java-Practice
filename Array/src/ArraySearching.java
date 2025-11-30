import java.util.Scanner;

public class ArraySearching {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int[] arr = {3, 6, 7, 34, 53, 56, 32,76, 45, 41, 67 };

        System.out.println("Welcome to Array searching.\n");
        System.out.print("Input your number: ");
        int number = Input.nextInt();

        boolean found = isFound(arr , number);
        if (found){
            System.out.println("The number has been found in the array");
        }else {
            System.out.println("The number has not been found in the array");
        }
    }
    public static boolean isFound(int arr[] , int number){
        int index = 0;
        while (index < arr.length){
            if (arr[index] == number){
                return true;
            }
            index++;
        }
        return false;
    }
}
