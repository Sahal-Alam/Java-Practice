import java.util.Scanner;

class EqualFloatingNumbers {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input first float number: ");
         float number1 = input.nextFloat();
         System.out.print("Input second float number: ");
         float number2 = input.nextFloat();

         if (number1 == number2){
             System.out.println("The float numbers are equal.");
         }else {
             System.out.println("The float numbers are not equal.");
         }
     }
}
