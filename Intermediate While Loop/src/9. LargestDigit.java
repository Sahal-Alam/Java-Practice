import java.util.Scanner;

class LargestDigit {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = input.nextInt();

         int large = 0;
         int digit = 0;

         while (number > 0){
             digit = number % 10;
             if (digit > large){
                 large = digit;
             }
             number = number / 10;
         }
         System.out.println(large);
     }
}
