public class SumOf1To100 {
    static void main(String[] args) {
        sumOfNumbers();
    }
    public static void sumOfNumbers(){
        int i = 0 , sum = 0;
        while (i <= 100){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
