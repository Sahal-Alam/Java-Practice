import java.util.Scanner;

class TwoChracterComparison {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first character: ");
        char alphabet1 = input.next().charAt(0);
        System.out.print("Input second character: ");
        char alphabet2 = input.next().charAt(0);

        if (alphabet1 < alphabet2){
            System.out.println(alphabet1+" comes before "+alphabet2);
        } else if (alphabet1 > alphabet2) {
            System.out.println(alphabet2+" comes before "+alphabet1);
        }else {
            System.out.println(alphabet1+" and "+alphabet2+" are same");
        }
    }
}
