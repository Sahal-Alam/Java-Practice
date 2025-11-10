import java.util.Scanner;

public class RelationalOperators {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal!");

        System.out.print("\nPlease enter your age: ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You are eligible for driving.");
        }else {
            System.out.println("You are not eligible for driving.");
        }
    }
}
