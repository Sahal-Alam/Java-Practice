import java.util.Scanner;

 class GreaterSmallerOrEqual {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int number1 = input.nextInt();
        System.out.print("Input the second number: ");
        int number2 = input.nextInt();

        if (number1 > number2){
            System.out.println("First number is greater than the second number.");
        } else if (number1 < number2) {
            System.out.println("First number is smaller than the second number.");
        }else {
            System.out.println("The numbers are equal!");
        }
    }
}
