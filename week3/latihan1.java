import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        int r_1, r_2, r_3, r_4;
        double V, rP, rTotal;
        int I = 5;

        System.out.println("Masukkan Nilai R1 : ");
        r_1 = yo.nextInt();
        System.out.println("Masukkan Nilai R2 :");
        r_2 = yo.nextInt();
        System.out.println("Masukkan Nilai R3 :");
        r_3 = yo.nextInt();
        System.out.println("Masukkan Nilai R4 :");
        r_4 = yo.nextInt();
        rP = 1.0/r_1 + 1.0/r_2 + 1.0/r_3;
        System.out.println("Nilai R paralel = "+rP);
        rTotal = r_4 + rP;
        System.out.println("Nilai R total = "+rTotal);
        V = I * rTotal;
        System.out.println("Nilai V adalah : "+ V);

        
    }


    }
    

