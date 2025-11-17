import java.util.Scanner;

class PrintMultiplicationTable {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number: ");
        int number = input.nextInt();

        int i = 1;
        while (i <= 100){
            System.out.println(number +" * "+i+ " = "+ (number * i));
            i++;
        }
    }
}
