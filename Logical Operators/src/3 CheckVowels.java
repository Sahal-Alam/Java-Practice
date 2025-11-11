import java.util.Scanner;

class CheckVowels {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a character: ");
        char letter = input.next().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println(letter+" is a vowel.");
        } else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter+" is a vowel.");
        }else {
            System.out.println(letter+" is not a vowel.");
        }
    }
}
