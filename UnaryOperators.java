import java.util.Scanner;

public class UnaryOperators {
    static void main(String[] args) {
        Scanner unary = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int takenNumber = unary.nextInt();

        takenNumber++;
    //  takenNumber = takenNumber++; //This will not show the increment value, because the JLS(Java Language Specification) overwrites the increment value and it shows the old value. So either do only ++takenNumber or takenNumber = takenNumber+1. This will increment the value and will show the output in the next "sout" line if implemented.
        System.out.println(takenNumber);
        takenNumber = ++takenNumber;
        System.out.println(takenNumber);
    }
}
