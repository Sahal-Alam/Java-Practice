import java.util.Scanner;

 class LessThan100 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int number = input.nextInt();

        if (number < 100){
            System.out.println("The number is less than 100.");
//        } else if (number <= 100) {
//            System.out.println("The number is equal to 100");
        } else {
            System.out.println("The number is not less than 100.");
        }
    }
}
