import java.util.Scanner;
public class PemilihanPercobaan201 {

    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("nilai uas       : ");
        float uas = input01.nextFloat();
        System.out.print("nilai uts       : ");
        float uts = input01.nextFloat();
        System.out.print("nilai kuis      : ");
        float kuis = input01.nextFloat();
        System.out.print("nilai tugas     : ");
        float tugas = input01.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        System.out.println(total);

        if (total >= 80 && total <= 100) {
            System.out.println("=============KATEGORI=============");
            System.out.println("Nilai huruf     : A");
            System.out.println("Nilai setara    : 4");
            System.out.println("Kategori nilai  : Sangat baik");
        }
        else if(total >= 73 && total <80 ){
            System.out.println("=============KATEGORI=============");
            System.out.println("Nilai huruf     : B+");
            System.out.println("Nilai setara    : 3,5");
            System.out.println("Kategori nilai  : Lebih dari baik");
        }
        else if (total >= 65 && total < 73){
            System.out.println("=============KATEGORI=============");
            System.out.println("Nilai huruf     : B");
            System.out.println("Nilai setara    : 3");
            System.out.println("Kategori nilai  : Baik");
        }
        else if(total >= 60 && total <65){
            System.out.println("=============KATEGORI=============");
            System.out.println("Nilai huruf     : C+");
            System.out.println("Nilai setara    : 2,5");
            System.out.println("Kategori nilai  : Lebih dari cukup");
        }else if(total >= 50 && total< 60){
            System.out.println("=============KATEGORI=============");
            System.out.println("Nilai huruf     : C");
            System.out.println("Nilai setara    : 2");
            System.out.println("Kategori nilai  : Cukup");
        }else if(total >=39 && total <50){
            System.out.println("=============KATEGORI=============");
            System.out.println("Nilai huruf     : D");
            System.out.println("Nilai setara    : 1");
            System.out.println("Kategori nilai  : Kurang");
        }
        else{
            System.out.println("=============KATEGORI=============");
            System.out.println("Nilai huruf     : F");
            System.out.println("Nilai setara    : 0");
            System.out.println("Kategori nilai  : Gagal");
        }
    }
}