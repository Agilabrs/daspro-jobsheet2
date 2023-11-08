import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu='y';
        do{
            int number = random.nextInt(10);
            boolean success = true;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                
                if (answer > number) {
                    System.out.println("Jawaban anda terlalu tinggi");
                }else if (answer<number){
                    System.out.println("Jawaban anda terlalu rendah");
                }else if (answer==number==success) {
                   System.out.println("Jawaban anda benar"); 
                }
            } while(success);
            System.out.print("Apakah Anda ingin mengulang permainan (y/n)?");
            menu = input.nextLine().charAt(0);
        } while(menu=='y');
        do {
            System.out.println("terimakasih, bermainlah lagi");
        } while (menu == 'n');
            
        }
    }

