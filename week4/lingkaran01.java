import java.util.Scanner;

public class lingkaran01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas;
        double phi = 3.14;
        
        System.out.println("Masukkan nilai r = ");
        r = input.nextInt();

        keliling = 2*phi*r; 
        luas = phi*r*r;

        System.out.println("Hasil Keliling = "+ keliling);
        System.out.println("Hasil Luas = "+ luas);
    }   
}
