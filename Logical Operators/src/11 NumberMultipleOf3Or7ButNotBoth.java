import java.util.Scanner;

class NumberMultipleOf3Or7ButNotBoth {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int num = input.nextInt();

        if ((num%3==0||num%7==0)&&!(num%3==0&&num%7==0)){
            System.out.println(num + " is a multiple of 3 or 7, but not both.");
        }else {
            System.out.println(num+" does not satisfy the condition.");
        }
    }
}
