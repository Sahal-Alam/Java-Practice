import java.util.Scanner;

class CheckGreaterOrLess {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         if (number > 0 && number < 100){
             System.out.println("True");
         }else {
             System.out.println("False");
         }
    }
}
