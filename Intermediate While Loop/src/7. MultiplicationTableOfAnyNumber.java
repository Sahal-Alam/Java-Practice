import java.util.Scanner;

class MultiplicationTableOfAnyNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = input.nextInt();

         int i = 1;
         while (i <= 10){
             System.out.println(number+" * "+i+" = "+(number * i));
             i++;
         }
     }
}
