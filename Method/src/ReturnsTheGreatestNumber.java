import java.util.Scanner;

public class ReturnsTheGreatestNumber {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("\nWelcome to find the Greatest Number.\n");

        System.out.print("Input first number: ");
        int number1 = Input.nextInt();
        System.out.print("Input second number: ");
        int number2 = Input.nextInt();

        int result = greatestNumber(number1 , number2);
        System.out.println();
        System.out.println("The greatest number is: "+result);
    }
    public static int greatestNumber(int num1 , int num2){
        if (num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
