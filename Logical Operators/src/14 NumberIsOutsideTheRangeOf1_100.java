import java.util.Scanner;

class NumberIsOutsideTheRangeOf1_100 {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = input.nextInt();

         if (!(num>=1&&num<=100)){
             System.out.println(num+" is outside the range 1–100.");
         }else {
             System.out.println(num+" is within the range 1–100.");
         }
     }
}
