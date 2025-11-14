public class LeftHalfPyramidWithWhileLoop {
    static void main(String[] args) {
//        System.out.println("        *");
//        System.out.println("      * *");
//        System.out.println("    * * *");
//        System.out.println("  * * * *");
//        System.out.println("* * * * *");

        int pattern = 5;
        while (pattern > 0){
            System.out.print("        *");

            int i = 5;
            while (pattern < i){
                System.out.print("* ");
                i--;
            }
            pattern--;
            System.out.println();
        }
    }
}
