import java.util.Scanner;

class LeapYear {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a year: ");
         int year = input.nextInt();

         if (year%4==0 && (year%100!=0)||(year%400==0)){
             System.out.println("Leap year");
         }else {
             System.out.println("Not leap year");
         }
     }
}
