package week5;

import java.util.Scanner;
public class PemilihanPercobaan101 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka: ");
         angka = input00.nextInt();
    
        System.out.println("Angka "+angka+" bilangan "+(angka%2 == 0 ? "genap" : "ganjil"));
    
}
    
}