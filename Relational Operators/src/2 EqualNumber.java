import java.util.Scanner;

 class EqualNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Give me the second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("The numbers are equal!");
        }else {
            System.out.println("The numbers are not equal!");
        }
    }
}
