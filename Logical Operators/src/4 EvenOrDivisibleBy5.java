import java.util.Scanner;

class EvenOrDivisibleBy5 {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         if (number%2==0 || number%5==0){
             System.out.println(number+ " is either even or divisible by 5.");
         }else {
             System.out.println(number+" is neither even or divisible by 5.");
         }
     }
}
