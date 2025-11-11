import java.util.Scanner;

class Between10And50ORBetween100And200 {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a Number: ");
         int number = input.nextInt();

         if (number>=10&&number<=50||number>=100&&number<=200){
             System.out.println("It's a valid number!");
         }else {
             System.out.println("It's an invalid number!");
         }
     }
}
