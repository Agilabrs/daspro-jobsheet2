import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat N (N > 0): ");
        int N = scanner.nextInt();
        scanner.close();

        // Memastikan N lebih dari 0
        if (N > 0) {
            // Menghitung penjumlahan N bilangan kuadrat pertama
            int hasil = 0;
            for (int i = 1; i <= N; i++) {
                hasil += i * i;
            }

            // Menampilkan hasil
            System.out.println("Penjumlahan N bilangan kuadrat pertama adalah: " + hasil);
        } else {
            System.out.println("Masukkan tidak valid. N harus lebih dari 0.");
        }
    }
}