class PrintTheLargestNumber {
    static void main(String[] args) {
        int[] array = {4 , 7, 2, 8, 5};
        int i = 0;
        int largest = 0;
        while (i < array.length){
            if (array[i] >= largest){
                largest = array[i];
            }
            i++;
        }
        System.out.println("The largest number in the array is: "+largest);
    }
}
