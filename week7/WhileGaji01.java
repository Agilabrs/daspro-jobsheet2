import java.util.*;
public class WhileGaji01 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int jumlahKaryawan, jumlahJamLembur;
    double gajiLembur = 0, totalGajiLembur = 0;
    String jabatan;

    System.out.print("Masukkan jumlah karyawan: ");
    jumlahKaryawan = scan.nextInt();
    
    int i = 0;

    while (i<jumlahKaryawan){
        System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
        System.out.print("Masukkan jabatan Karyawan ke- "+(i+1)+": ");
        jabatan = scan.next();
        System.out.print("Masukkan jumlah jam lembur: ");
        jumlahJamLembur = scan.nextInt();
        i++;

        if (jabatan.equalsIgnoreCase("direktur")){
            continue;
        }else if (jabatan.equalsIgnoreCase("manajer")){
            gajiLembur = 100000 * jumlahJamLembur;
        }else if (jabatan.equalsIgnoreCase("karyawan")){
            gajiLembur = 75000 * jumlahJamLembur;
        }
        totalGajiLembur += gajiLembur;
    }
        System.out.println("Total gaji lembur: "+totalGajiLembur);

    }
    
}
