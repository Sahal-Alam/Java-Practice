import java.util.Scanner;

public class ReturnsTheSumOfDigitsOfANumber {
    static void main(String[] args) {
        int sum = sumOfDigits();
        System.out.println("The sum of Digits of the number is: "+sum);
    }
    public static int sumOfDigits(){
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int sum = 0 , i = 0;
        while (number > 0){
            i = number % 10;
            sum = sum + i;
            number = number / 10;
        }
        return sum;
    }
}
