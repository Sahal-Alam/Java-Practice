import java.util.Scanner;

public class ReturnsTheSquare {
    static void main(String[] args) {
        int result = square();
        System.out.println(result);
    }
    public static int square(){
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        int square = Math.powExact(number , 2);
        System.out.print("The square of "+number+" is: ");

        return square;
    }
}
