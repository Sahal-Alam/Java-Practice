import java.util.Scanner;

class NumberIsBetween50And100AndDivisibleBy5 {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = input.nextInt();

         if (num>=50&&num<=100&&num%5==0){
             System.out.println(num+" is between 50 and 100 and divisible by 5.");
         }else {
             System.out.println(num+" is not between 50 and 100 and divisible by 5.");
         }
     }
}
