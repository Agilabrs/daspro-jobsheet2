import java.util.Scanner;
public class percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            System.out.println("*0 = 1");
            return(1);
        }else{
            int hasilRekursif = (x *hitungPangkat(x, y-1));
            System.out.println(x+" * "+y+" = "+hasilRekursif);
            for (int i =0;i<=y;i++) {
                System.out.print(x + " * ");
            }
            System.out.print(hasilRekursif);
            System.out.println();
            return hasilRekursif;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang digunakan: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
        sc.close();
    }
}
