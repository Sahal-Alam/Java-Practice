import java.util.Scanner;

class SumOfDigits {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         int result = 0;
         int digit = 0;
         while (number > 0){
             digit = number % 10;
             result = result + digit;
             number = number / 10;
         }
         System.out.println("The sum of "+number+" is : "+result);
     }
}
