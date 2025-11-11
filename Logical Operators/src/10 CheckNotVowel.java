import java.util.Scanner;

class CheckNotVowel{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a letter: ");
        char ch = input.next().charAt(0);

        if (!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
            System.out.println("Not vowel");
        } else {
            System.out.println("Vowel");
        }
    }
}
