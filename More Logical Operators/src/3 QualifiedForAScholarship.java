import java.util.Scanner;

class QualifiedForAScholarship {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter your CGPA: ");
         float cgpa = input.nextFloat();
         System.out.print("Please enter your father's income: ");
         int income = input.nextInt();
         System.out.print("Are you from rural area? True/False: ");
         boolean rural = input.nextBoolean();

         if ((cgpa>=3.5||income<=2500)||rural==true){
             System.out.println("You are qualified for the scholarship");
         }else {
             System.out.println("You are not qualified for the scholarship");
         }
     }
}
