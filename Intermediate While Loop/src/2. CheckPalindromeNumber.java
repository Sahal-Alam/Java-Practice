import java.util.Scanner;

class CheckPalindromeNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();
         int original = number;

         int reverse = 0;
         while (number>0){
             int digit = number % 10;
             reverse = (reverse*10) + digit;
             number = number / 10;
         }
         if (original == reverse){
             System.out.println("Your entered number is Palindrome");
         }else {
             System.out.println("Your entered number is not Palindrome");
         }
     }
}
