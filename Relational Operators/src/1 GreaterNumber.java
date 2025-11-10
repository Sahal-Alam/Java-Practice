import java.util.Scanner;

 class GreaterNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the greater number determinator!");

        System.out.print("Please enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Now, please enter your second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("First number "+firstNumber+" is the greatest.");
        } else if (firstNumber >= secondNumber) {
            System.out.println("The both numbers are same!");
        } else {
            System.out.println("Second number "+secondNumber+" is the greatest.");
        }
    }
}
