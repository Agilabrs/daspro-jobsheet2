import java.util.Scanner;
public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input variabel
        int[] nilaiMhs = new int[5];
        double totalLulus = 0, totalTdkLulus = 0;
        double rata2lulus = 0, rata2tdklulus = 0;
        // looping
        for (int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        // modif
       
         int tdkLulus = 0, lulus = 0;
        for (int i=0; i<nilaiMhs.length; i++){
            if (nilaiMhs[i]>70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            }else{
                totalTdkLulus += nilaiMhs[i];
                tdkLulus++;
            }
        }
        // rumus rata rata
        rata2lulus = totalLulus/lulus;
        rata2tdklulus = totalTdkLulus/tdkLulus;
        System.out.println("Rata-rata nilai yang lulus: "+rata2lulus);
        System.out.println("Rata-rata nilai yang tidak lulus:"+rata2tdklulus);
    }
}
