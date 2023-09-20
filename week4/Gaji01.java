import java.util.Scanner;

public class Gaji01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;
        System.out.println("Masukkan jumlah hari masuk kerja anda : ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda : ");
        jmlTdkMasuk = input.nextInt();
        System.out.println("masukkan gaji per hari anda :");
        gaji = input.nextInt();
        System.out.println("Masukkan Potongan Gaji per hari anda : ");
        potGaji = input.nextInt();
        
        totGaji = (jmlMasuk*gaji) - (jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah : "+ totGaji);

    }
    
}
