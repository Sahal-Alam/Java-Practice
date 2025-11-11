import java.util.Scanner;

class QualifiedForALoan {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter your salary: ");
         int salary = input.nextInt();
         System.out.print("Please enter your age: ");
         int age = input.nextInt();

         if (salary>=20000 && age>=21){
             System.out.println("You are qualified for the loan");
         }else {
             System.out.println("You are not qualified for the loan.");
         }
     }
}
