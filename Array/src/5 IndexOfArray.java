import java.util.Scanner;

class IndexOfArray {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element no "+(i + 1)+ " : ");
            array[i] = Input.nextInt();
            i++;
        }
        System.out.print("Enter a number to find: ");
        int number = Input.nextInt();
        System.out.println(index(array , number));
    }
    public static int index(int[] array , int number){
        int i = 0;
        while (i < array.length){
            if (array[i] == number){
                System.out.println("The index is: "+i);
                i++;
            }else {
                System.out.println("The number was not found in the array.");
            }

        }
        return i;
    }
}
