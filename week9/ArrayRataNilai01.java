import java.util.Scanner;
public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input variabel
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        // looping
        for (int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i=0; i<nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }
        // rumus rata rata
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai "+rata2);

    }
}
