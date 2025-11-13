import java.util.Scanner;

class NotUnderageAndUnemployed {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the age: ");
         int age = input.nextInt();
         System.out.print("Is employed? True?False: ");
         boolean employed = input.nextBoolean();

         if (!(age>18&&employed==true)){
             System.out.println("Condition True.");
         }else {
             System.out.println("Condition False");
         }
     }
}
