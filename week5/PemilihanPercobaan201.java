import java.util.Scanner;
public class PemilihanPercobaan201 {

    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("nilai uas       : ");
        float uas = input01.nextFloat();
        System.out.print("nilai uts       : ");
        float uts = input01.nextFloat();
        System.out.print("nilai kuis      : ");
        float kuis = input01.nextFloat();
        System.out.print("nilai tugas     : ");
        float tugas = input01.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        String massage = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir = "+total+ " sehingga "+massage);
    }
}