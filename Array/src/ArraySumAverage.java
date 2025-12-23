import java.util.Scanner;

public class ArraySumAverage {
    static void main(String[] args) {
        int[] newArray = ArrayUtility.array();
        int sum = sum(newArray);
        System.out.println("The sum of the array is : "+sum);

        double average = average(newArray);
        System.out.println("The average of the array is: "+average);
    }
    public static int sum(int[] newArray){
        int sum = 0;
        int i = 0;
        while (i < newArray.length){
            sum = sum + newArray[i] ;
            i++;
        }
        return sum;
    }
    public static double average(int[] newArray){
        int sum = sum(newArray);
        double avg = (double) sum / newArray.length;
        return avg ;
    }
}
