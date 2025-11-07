import java.util.Scanner;

public class ShortHandOperators {
    static void main() {
        Scanner shorthand = new Scanner(System.in);
        int i = 5;

        System.out.print("Give me the 1st number: ");
        int i1 = shorthand.nextInt();
        i += i1;

        System.out.println(i);

        System.out.print("Give me the 2nd number:");
        int i2 = shorthand.nextInt();
        i += i2;

        System.out.println(i);

        System.out.print("Give me the 3rd number: ");
        int i3 = shorthand.nextInt();
        i -= i3;

        System.out.println(i);

        System.out.print("Give me the 4th number: ");
        int i4 = shorthand.nextInt();
        i -= i4;

        System.out.println(i);

        System.out.print("Give me the 5th number: ");
        int i5 = shorthand.nextInt();
        i *= i5;

        System.out.println(i);

        System.out.println("Give me the 6th number: ");
        float i6 = shorthand.nextFloat();
        i *= i6;

        System.out.println(i);

        System.out.println("Give me the 7th number: ");
        double d7 = shorthand.nextDouble();
        i /= d7;

        System.out.println(i);

        System.out.println("Give me the 8th number: ");
        double d8 = shorthand.nextDouble();
        i /= d8;

        System.out.println(i);
    }
}
