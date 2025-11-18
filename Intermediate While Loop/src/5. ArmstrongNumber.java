import java.util.Scanner;

class ArmstrongNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        int store = number;
        int original = number;
        double sum = 0;
        int digit = 0;
        int count = 0;
        while (number > 0){
            number = number/10;
            count++;
        }
        while (original > 0){
            digit = original % 10;
            double cube = Math.pow(digit,count);
            sum = sum + cube;
            original = original / 10;
        }
        if (store == sum){
            System.out.println("Your input number "+store+" is Armstrong");
        }else {
            System.out.println("Your input number "+store+" is not Armstrong");
        }
    }
}
