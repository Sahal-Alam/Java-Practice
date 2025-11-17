 class NumbersDivisibleBy5 {
     static void main(String[] args) {
         int i = 1;
         while (i <= 50){
             if (i%5 == 0){
                 System.out.println("Number "+i+" is divisible by 5 and result is: "+(i/5));
             }
             i++;
         }
     }
}
