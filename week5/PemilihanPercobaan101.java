package week5;

import java.util.Scanner;
public class PemilihanPercobaan101 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input00.nextInt();
        
        if (angka %2 == 0) 
            System.out.println("Angka "+angka+" Bilangan Genap");
        else 
            System.out.println("Angka "+angka+" Bilangan Ganjil");
}
    
}