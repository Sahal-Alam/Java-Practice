public class NewArray {
    static void main(String[] args) {
        int[] myArray = new int[5];

        myArray[0] = 56 ;
        myArray[1] = 64 ;
        myArray[2] = 23 ;
        myArray[3] = 87 ;
        myArray[4] = 31 ;

        System.out.println(myArray[0]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        System.out.println(myArray[1]);
        System.out.println();

        int[] newArray = {5 , 14, 62, 34 , 78};

        int index = 0;
        while (index < 5) {
            System.out.println(newArray[index]);
            index++ ;
        }

        System.out.println();

        int ind = 0;
        while (ind < newArray.length){
            System.out.println(newArray[ind]);
            ind++;
        }
    }
}
