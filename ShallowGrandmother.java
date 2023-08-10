import java.util.Scanner;

public class ShallowGrandmother{
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int umur;
        double pendapatan, ganteng;
        boolean allowed;

        System.out.println("Masukkan umur: ");
        umur = keyboard.nextInt();

        System.out.println("Masukkan pendapatan mu per tahun: ");
        pendapatan = keyboard.nextDouble();

        System.out.println("Seberapa ganteng kamu, dari skala 0.0 sampai 10.0?");
        ganteng = keyboard.nextDouble();

        allowed = ( umur > 25 && umur <40 && (pendapatan > 50000 || ganteng >= 8.5 ));

        System.out.println("diizinkan berkencan dengan cucu saya? " + allowed);


    }
}