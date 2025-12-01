import java.util.Scanner;

public class ReturnsTheCountOfDigits {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int result = countOfDigits(number);
        System.out.println(result);
    }
    public static int countOfDigits(int num){
        int number = num ;
        int count = 0;
        while (number > 0){
            number = number / 10;
            count++;
        }
        return count;
    }
}
