import java.util.Scanner;

public class ForKelipatan01 {
    public static void main(String[] args) {
        Scanner scan01 = new Scanner(System.in);

        int kelipatan, rata;
        int jumlah = 0, counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan01.nextInt();

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
            jumlah += i;
            counter++;
            }
        }
        rata = (jumlah / counter);
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, rata);
    }
    
}