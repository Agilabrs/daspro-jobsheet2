import java.util.Scanner;

public class HargaBayar01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merkBuku;
        int harga, jumlah, jmlHal;
        double dis, total, bayar, jmlDis;
        System.out.println("Masukkan merk Buku yang dibeli : ");
        merkBuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku : ");
        jmlHal = input.nextInt();
        System.out.println("masukkan harga buku yang dibeli :");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah buku yang dibeli :");
        jumlah = input.nextInt();
        System.out.println("Jumlah diskon yang tertera : ");
        dis =  input.nextDouble();
        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;
        System.out.println("Jumlah diskon yang anda dapatkan : "+ jmlDis);
        System.out.println("Jumlah yang harus anda bayarkan : "+ bayar);
    

    }
    
}
