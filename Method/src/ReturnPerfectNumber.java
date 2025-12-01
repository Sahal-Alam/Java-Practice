import java.util.Scanner;

public class ReturnPerfectNumber {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Input.nextInt();

        boolean result = isPerfectNumber(number);

        System.out.println(result);
    }
    public static boolean isPerfectNumber(int num){
        int i = 1 , store = 0;
        while (i < num){
            if (num % i == 0){
                store = store + i;
            }
            i++;
        }
        if (store == num){
            return true;
        }else {
            return false;
        }
    }
}
