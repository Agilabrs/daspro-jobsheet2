import java.util.Scanner;
public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {
      Scanner input01 = new Scanner(System.in);
      float sudut1, sudut2, sudut3, totsudut;

      System.out.print("sudut pertama : ");
      sudut1 = input01.nextFloat();
      System.out.print("sudut kedua : ");
      sudut2 = input01.nextFloat();
      System.out.print("sudut ketiga : ");
      sudut3 = input01.nextFloat();

      totsudut = sudut1 + sudut2 + sudut3;

      if (totsudut == 180)
        if ((sudut1==90) || (sudut2==90) || (sudut3==90))
          System.out.println("segitiga tersebut adalah segitiga siku siku");
            else if ((sudut1==60) && (sudut2==60) && (sudut3==60))
              System.out.println("segitiga tersebut merupakan segitiga sama sisi");
            else if ((sudut1==sudut2) || (sudut1==sudut3) || (sudut2==sudut3))
              System.out.println("segitiga tersebut merupakan segitiga sama kaki");
            else 
              System.out.println("segitiga tersebut merupakan segitiga sembarang");
        else
        System.out.println("bukan segitiga");
      
      
    }
}
