class PrintTheSmallestNumber {
    static void main(String[] args) {
        int[] array = {4 , 7, 2, 8, 5, 1};
        int i = 0 , smallest = array[0];
        while (i < array.length){
            if (array[i] <= smallest){
                smallest = array[i];
            }
            i++;
        }
        System.out.println("The smallest number is: "+smallest);
    }
}
