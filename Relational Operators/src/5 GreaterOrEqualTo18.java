import java.util.Scanner;

class GreaterOrEqualTo18 {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Please input a number: ");
         int number = input.nextInt();

         if (number > 18){
             System.out.println("The number is greater than 18.");
         } else if (number == 18) {
             System.out.println("The number is equal to 18.");
         }else {
             System.out.println("The number is not greater nor equal to 18.");
         }
     }
}
