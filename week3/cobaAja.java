import java.util.Scanner;

public class cobaAja{
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

    String namaUser, alamatUser, jenisBarang;
    long noHp;
    float biaya, jarak, beratBarang;
    int a = 2000;
    
    System.out.println("-------LOGIN MENU-------");
    System.out.println("Nama User : ");
    namaUser = oh.next();
    System.out.println("NO Hp User : ");
    noHp = oh.nextInt();
    System.out.println("Alamat User : ");
    alamatUser = oh.next();
    System.out.println("Data Pengguna : \n,\n,\n"+  namaUser +  noHp + alamatUser);
    System.out.println("masukan jenis barang :");
    jenisBarang = oh.next();
    System.out.println("Jumlah Berat Barang : ");
    beratBarang = oh.nextInt();
    System.out.println("Jarak tujuan : ");
    jarak = oh.nextInt();
    biaya = beratBarang * a * jarak;
    System.out.println("-----Data Barang-----");
    System.out.printf(jenisBarang + beratBarang + jarak + biaya);
        



}

}
