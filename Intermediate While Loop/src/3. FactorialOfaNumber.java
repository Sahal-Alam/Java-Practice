import java.util.Scanner;

class FactorialOfaNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         int i =1;
         int result = 1;
         while (i <= number ){
             result = result * i;
             i++;
         }
         System.out.println("The factorial is: "+result);
     }
}
