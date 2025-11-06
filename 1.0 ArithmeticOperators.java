import java.util.Scanner;

class ArithmeticOperators {
    static void main() {
        int a = 10;
        int b = 4;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        Scanner sc = new Scanner(System.in);
        System.out.print("Give me the first number: ");
        int x = sc.nextInt();
        System.out.print("Give me the second number: ");
        int y = sc.nextInt();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        System.out.print("Give me the first float number: ");
        float f1 = sc.nextFloat();
        System.out.print("Give me the second float number: ");
        float f2 = sc.nextFloat();
        System.out.println(f1+f2);
        System.out.println(f1-f2);
        System.out.println(f1*f2);
        System.out.println(f1/f2);
        System.out.println(f1%f2);

        System.out.print("Give me the first double number: ");
        double d1 = sc.nextDouble();
        System.out.print("Give me the second double number: ");
        double d2 = sc.nextDouble();
        System.out.println(d1+d2);
        System.out.println(d1-d2);
        System.out.println(d1*d2);
        System.out.println(d1/d2);
        System.out.println(d1%d2);
    }
}
