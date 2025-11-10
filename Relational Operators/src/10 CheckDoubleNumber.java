import java.util.Scanner;

class CheckDoubleNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input the first number: ");
         int number1 = input.nextInt();
         System.out.print("Input the second number: ");
         int number2 = input.nextInt();

         if (number1 == number2*2){
             System.out.println(number1+" is double than the number "+number2);
         } else if (number2 == number1*2) {
             System.out.println(number2+" is double than the number "+number1);
         } else {
             System.out.println("No number is double than the other");
         }
     }
}
