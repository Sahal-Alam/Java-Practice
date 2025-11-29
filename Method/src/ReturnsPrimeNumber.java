import java.util.Scanner;

public class ReturnsPrimeNumber {
    static void main(String[] args) {
        System.out.println(isPrimeNumber());
    }
    public static boolean isPrimeNumber(){
        int num = inputNumber();

        int i = 2;
        while (i < num){
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int inputNumber(){
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        return number;
    }
}
