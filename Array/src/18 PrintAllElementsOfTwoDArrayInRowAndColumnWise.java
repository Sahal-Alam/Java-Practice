import java.util.Scanner;

class PrintAllElementsOfTwoDArrayInRowAndColumnWise {
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
        System.out.println();
        System.out.println("Row wise printing");
        rowArray(array);
        System.out.println();
        System.out.println("Column wise printing");
        columnArray(array);
    }
    public static int[][] rowArray(int[][] arr){
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            i++;
        }
        return arr;
    }
    public static int[][] columnArray(int[][] arr){
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.out.println(arr[i][j]+" ");
                j++;
            }
            i++;
        }
        return arr;
    }
}
