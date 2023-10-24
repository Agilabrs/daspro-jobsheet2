import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  input bilangan bulat N dari pengguna
        System.out.print("Masukkan bilangan bulat N (N > 0): ");
        int N = scanner.nextInt();

        // memastikan N lebih dari 0
        if (N > 0) {
            int jumlahDigitGanjil = hitungDigitGanjil(N);

            // hasil
            System.out.println("Jumlah digit ganjil dalam " + N + " adalah: " + jumlahDigitGanjil);
        } else {
            System.out.println("Masukkan tidak valid. N harus lebih dari 0.");
        }
    }

    // menghitung jumlah digit ganjil
    static int hitungDigitGanjil(int angka) {
        int jumlah = 0;

        while (angka > 0) {
            int digit = angka % 10;
            if (digit % 2 != 0) {
                jumlah++;
            }
            angka /= 10;
        }

        return jumlah;
    }
}
