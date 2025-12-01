import java.util.Scanner;

public class ReturnsFactorial {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("\nWelcome to the Factorial\n");

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int result = newNumber(number);
        System.out.println(result);
    }

    public static int newNumber(int num){
        int i = 1;
        int product = 1;
        while (i <= num){
            product = product * i;
            i++;
        }
        return product;
    }
}
