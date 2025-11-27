import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        evenOdd(15);
        evenOdd(316);
        evenOdd(23);
        evenOdd(34);
    }
    public static void evenOdd(int number){
        if (number % 2 == 0){
            System.out.println(number+ " is even.");
        }else{
            System.out.println(number+ " is odd");
        }
    }
}
