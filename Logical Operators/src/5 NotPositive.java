import java.util.Scanner;

class NotPositive {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int num = input.nextInt();

         if (!(num<0)){
             System.out.println(num+" is positive.");
         }else {
             System.out.println(num+" is negative.");
         }
     }
}
