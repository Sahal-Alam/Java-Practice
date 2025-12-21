import java.util.Scanner;

class CountPositiveNegativeZero {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Input element no " + (i + 1) + " : ");
            array[i] = Input.nextInt();
            i++;
        }
        System.out.println("There are "+positive(array)+" positive numbers in the array.");
        System.out.println("There are "+negative(array)+" negative numbers in the array.");
        System.out.println("There are "+zero(array)+" zero in the array.");
    }
    public static int positive(int[] arr) {
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] > 0) {
                count++;
            }
            i++;
        }
        return count;
    }
    public static int negative(int[] arr){
        int i = 0;
        int count = 0;
        while (i < arr.length){
            if (arr[i] < 0){
                count++;
            }
            i++;
        }
        return count;
    }
    public static int zero(int[] arr){
        int i = 0;
        int count = 0;
        while (i < arr.length){
            if (arr[i] == 0){
                count++;
            }
            i++;
        }
        return count;
    }
}
