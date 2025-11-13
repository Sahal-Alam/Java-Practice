import java.util.Scanner;

class NumberIsEvenAndGreaterThan10 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();

        if (num % 2 == 0 && num > 10) {
            System.out.println(num + " is even and greater than 10.");
        } else {
            System.out.println(num + " is not even or greater than 10.");
        }
    }
}