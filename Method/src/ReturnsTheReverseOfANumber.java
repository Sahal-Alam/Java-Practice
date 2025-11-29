import java.util.Scanner;

public class ReturnsTheReverseOfANumber {
    static void main(String[] args) {
        int number = reverseNumber();
        System.out.println("The reverse number = "+number);
    }
    public static int reverseNumber(){
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int reverse = 0 , i = 0;
        while (number > 0){
            i = number % 10 ;
            reverse = (reverse * 10) + i ;
            number = number / 10 ;
        }
        return reverse ;
    }
}
