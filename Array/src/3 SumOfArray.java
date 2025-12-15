import java.util.Scanner;

class SumOfArray {
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
        int sum = sumOfArray(array);
        System.out.println("The sum of the array is: "+sum);
    }
    public static int sumOfArray(int[] array){
        int i = 0 ;
        int sum = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        return sum;
    }
}
