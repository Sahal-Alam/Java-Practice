import java.util.Scanner;

class FibonacciSeries {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = input.nextInt();

         int a = 0;
         int b = 1;
         int i = 2;
         int next = 0;
         System.out.print(a+",");
         System.out.print(b);

         while (i < number){
             next = a + b;
             System.out.print(","+next);
             a = b;
             b = next;
             i++;
         }
     }
}
