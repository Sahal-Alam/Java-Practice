import java.util.Scanner;

public class Swap {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me the first number: ");
        int a = sc.nextInt();
        System.out.print("Give me the second number: ");
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("The swap has been done");
        System.out.println("The value of first number is now: "+a);
        System.out.print("The value of second number is now: "+b);
    }
}
