import java.util.Scanner;
public class percobaan3 {
    static double hitungLaba(double saldo, int tahun){
        if (tahun == 0){
            return saldo;
        }else{
            return (1.11*hitungLaba(saldo, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah saldo awal : ");
        double saldo = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun):");
        int tahun = sc.nextInt();
        System.out.println("Jumlah saldo setelah "+tahun+" tahun:");
        System.out.println(hitungLaba(saldo, tahun)); 
        sc.close();   
    }
}