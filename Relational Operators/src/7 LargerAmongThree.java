
import java.util.Scanner;

class LargerAmongThree {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input the first number: ");
         int number1 = input.nextInt();
         System.out.print("Input the second number: ");
         int number2 = input.nextInt();
         System.out.print("Input the third number: ");
         int number3 = input.nextInt();

         if(number1 >= number2 && number1 >= number3){
             System.out.println("The number "+number1+" is the greatest.");
         } else if (number2 >= number3) {
             System.out.println("The number "+number2+" is the greatest.");
         }else {
             System.out.println("The number "+number3+" is the greatest.");
         }
     }
}
