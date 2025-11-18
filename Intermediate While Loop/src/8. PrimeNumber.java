import java.util.Scanner;

class PrimeNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = input.nextInt();

         if (number > 0 && ((number % 1==0) && (number % number == 0))){
             System.out.println(number+" is a not prime number");
         }else {
             System.out.println(number+" is a prime number");
         }
     }
}
