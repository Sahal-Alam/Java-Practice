import java.util.Scanner;

class MultipleAppearances {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Input the element no "+(i+1)+" : ");
            array[i] = Input.nextInt();
            i++;
        }
        System.out.print("Input the number you want to search in the array: ");
        int number  = Input.nextInt();

        if (appeared(array , number) > 1){
            System.out.println("The given number appeared more than once in the array.");
        }
        else {
            System.out.println("The given number did not appear more than once in the array.");
        }
    }
    public static int appeared(int[] arr , int num){
        int i = 0 , count = 0;
        while (i < arr.length){
            if (num == arr[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
