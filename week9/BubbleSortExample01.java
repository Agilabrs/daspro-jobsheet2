public class BubbleSortExample01 {
    public static void main(String[] args) {
        // inisiasi variable
        int[] intdata = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;
        // looping
        for (int i=0; i<intdata.length; i++){
            for (int j=1; j<intdata.length-i; j++){
                if (intdata[j-1]< intdata[j]) {
                    // swap element
                    temp = intdata[j];
                    intdata[j] = intdata[j-1];
                    intdata[j-1] = temp;

                }
            }
        }
         // pengurutan
            System.out.println("Hasil pegurutan: ");
            for (int i=0; i<intdata.length; i++){
                System.out.println(intdata[i]);
            }
    }
}
