import java.util.Scanner;

public class ReturnsTheLargestOfTwoNumbers {
    static void main(String[] args) {
        System.out.print("The largest number is: "+largestNumber());
        System.out.println();
    }


    public static int inputNumber(){
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        return number;
    }


    public static int largestNumber(){
        int number1 = inputNumber();
        int number2 = inputNumber();

        if (number1 > number2){
            return number1;
        }else {
            return number2;
        }
    }
}
