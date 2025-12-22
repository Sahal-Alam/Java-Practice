import java.util.Scanner;

class UserInputTwoDimensionalArray {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int row = Input.nextInt();
        System.out.print("Enter the size of column: ");
        int column = Input.nextInt();

        int[][] array = new int[row][column];
        int i = 0;
        while (i < array.length){
            int j = 0;
            while (j < array.length){
                System.out.print("Enter element of row "+(i+1)+" and column "+(j+1)+" : ");
                array[i][j] = Input.nextInt();
                j++;
            }
            i++;
            System.out.println();
        }
        int a = 0 ;
        while (a < array.length){
            int b = 0;
            while (b < array.length){
                System.out.print(array[a][b]+" ");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
