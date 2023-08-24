import java.util.Scanner;

public class AgeMessages{
    public static void main( String[] args) {
        Scanner input = new Scanner (System.in);
        int umur;

        System.out.print("Umur Kamu Berapa?");
        umur = input.nextInt();

        if(umur >= 18) {
            System.out.println("Kamu bisa Membuat SIM!");
        }
        if(umur >= 17) {
            System.out.println("Kamu bisa Membuat KTP!");
        }
         if(umur > 25) {
            System.out.println("Kamu ideal untuk menikah!");
        }
    }
}
