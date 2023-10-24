import java.util.Scanner;
public class ujian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totSudut = 180;

        System.out.print("Masukkan sudut 1 : ");
        sudut1 = input.nextInt();
        System.out.print("Masukkan sudut 2 : ");
        sudut2 = input.nextInt();
        System.out.print("Masukkan sudut 3 : ");
        sudut3 = input.nextInt();
// if
        if (totSudut == 180) {
            if ((sudut1 + sudut2) == sudut3) {
                System.out.println("Segitiga Siku siku");
            }else{
                System.out.println("bukan siku siku");
            }
        }else if (totSudut != 180){
            System.out.println("Nilai input sudut tidak sesuai");
        }
    }
}