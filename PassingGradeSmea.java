import java.util.Scanner;

public class PassingGradeSmea{
    public static void main( String[] args) {
        Integer BahasaInggris, matematika, BahasaIndonesia;
        Integer passingGradeSMK, passingGradeSastra, passingGradeTIK;
       boolean isPassingSMK, isPassingSastra, isPassingTIK;
        double averageUjianSMK, averageBahasa;

         Scanner input = new Scanner(System.in);
         passingGradeSMK = 73;
         passingGradeSastra = 75;
         passingGradeTIK =  80;

        System.out.println("Masukkan nilai Bahasa.Inggris anda: ");
        BahasaInggris = input.nextInt();

        System.out.println("Masukkan nilai matematika anda: ");
        matematika = input.nextInt();

        System.out.println("Masukkan nilai BahasaIndonesia anda: ");
        BahasaIndonesia = input.nextInt();

        averageUjianSMK = (BahasaInggris + matematika + BahasaIndonesia)/3;
        averageBahasa = (BahasaInggris + BahasaIndonesia)/2;

        isPassingSMK = averageUjianSMK >= passingGradeSMK;
        isPassingSastra = averageBahasa >= passingGradeSastra;
        isPassingTIK = matematika > passingGradeTIK;

        System.out.println("berikut ini adalah hasil persyaratan anda untuk penerimaan calon siswa baru SMEA: "  );
        System.out.println("apakah anda lulus masuk SMEA? " + isPassingSMK);
        System.out.println("apakah anda lulus masuk jurusan sastra?? " + isPassingSastra);
        System.out.println("apakah anda lulus masuk jurusan TIK? " + isPassingTIK);
    }
}   
