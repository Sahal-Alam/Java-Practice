import java.util.Scanner;

class CountOddNumbers {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element no "+(i+1)+" : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("There are "+countOdd(array)+" odd numbers in the array.");
    }
    public static int countOdd(int[] array){
        int i = 0 , count = 0;
        while (i < array.length){
            if (array[i] % 2 != 0){
                count++;
            }
            i++;
        }
        return count;
    }
}
