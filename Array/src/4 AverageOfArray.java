import java.util.Scanner;

class AverageOfArray {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element no "+(i+1)+" : ");
            array[i] = Input.nextInt();
            i++;
        }
        System.out.println("The average of the array is: "+average(array));
    }
    public static double average(int[] array){
        int i = 0;
        double sum = 0;
        while (i < array.length){
            sum = sum + array[i];
            i++;
        }
        double average = sum / array.length;
        return average;
    }
}
