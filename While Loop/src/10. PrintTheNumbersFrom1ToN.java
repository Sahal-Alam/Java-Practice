import java.util.Scanner;

class PrintTheNumbersFrom1ToN {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         int i = 0;
         while (i <= number){
             System.out.println(i);
             i++;
         }
     }
}
