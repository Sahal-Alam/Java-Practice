import java.util.Scanner;

class PrintTheDigitsOfANumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number:");
         int number = input.nextInt();
         System.out.print("Numbers in reverse order: ");

         while (number > 0){
                 int digit = number%10;
             System.out.print(digit);
             number = number/10;
             }
         }
     }
