import java.util.Scanner;

class EligibleToVote {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Please enter your nationality: ");
        String nationality = input.nextLine();

        if ((age >= 18) && nationality.equalsIgnoreCase("Bangladeshi")){
            System.out.println("Congratulations,You are eligible to vote!");
        }else {
            System.out.println("Sorry, You are not eligible to vote.");
        }
    }
}