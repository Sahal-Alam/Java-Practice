import java.util.Scanner;

class DescendingArray {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Input element no "+(i+1)+" : ");
            array[i] = Input.nextInt();
            i++;
        }
        int[] sorted = descendingArray(array);
        System.out.print("The descending sorted array is: ");
        int j = 0;
        while (j < sorted.length){
            System.out.print(sorted[j]+" ");
            j++;
        }
    }
    public static int[] descendingArray(int[] arr){
        int i = 0;
        while (i < arr.length - 1){
            int j = i + 1;
            while (j < arr.length){
                if(arr[i] < arr[j]){
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
                j++;
            }
            i++;
        }
        return arr;
    }
}
