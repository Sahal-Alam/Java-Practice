import java.util.Scanner;

class PassBothSubject {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input first subject number: ");
         int sub1 = input.nextInt();
         System.out.print("Input second subject number: ");
         int sub2 = input.nextInt();

         if(sub1>=40 && sub2>=40){
             System.out.println("Passed in both subject.");
         }else {
             System.out.println("Didn't pass in both subject.");
         }
     }
}
