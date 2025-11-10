import java.util.Scanner;

class NumberBetweenTwoNumbers {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         if (number>=10 && number<=20){
             System.out.println("The number is between 10 and 20");
         }
         else {
             System.out.println("The number is not between 10 and 20");
         }
     }
}
