import java.util.Scanner;
   
public class CafeReservation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jeniskelamin, hari, result;
        int umur;
        double penampilan, uang;

        result = "";

        System.out.println("Selamat datang di Reservasi Cafe Zill"); 
		System.out.println("====================================\n");
		System.out.println("Silahkan Isi Data Berikut!");
		
		System.out.println("Masukkan Nama Anda");
		nama=input.next();
		
		System.out.println("Berapa Umur Anda?"); 
		umur = input.nextInt();
		
		System.out.println("Apa Jenis Kelamin anda (Pria/Wanita)") ; 
		jeniskelamin = input.next();
		
		System.out.println("Seberapa Menarik Penampilan Anda?");
		penampilan = input.nextDouble();
		
		System.out.println("Berapa Banyak Uang Yang Anda Miliki?"); 
		uang = input.nextDouble(); 
		
		System.out.println("Pada Hari Apa Anda Ingin Melakukan Reservasi?"); 
		hari = input.next();

        // Kondisi IF

        if(hari.equalsIgnoreCase("Senin")){
            if(umur >= 20 && umur <=30 && uang >=500){
                result = "Reservasi Sukses, Kamu bisa memesan di hari Senin, Young Night.";
            }else {
                result ="Maaf, Kamu tidak bisa memesan pada hari Senin, karena itu untuk Young Night";
            }
            }else if(hari.equalsIgnoreCase("Selasa")){
            if(umur >= 31 && umur <=50 && uang >=250){
                result = "Reservasi Sukses, Kamu bisa memesan di hari Selasa, Oldest Night.";
            }else {
                result ="Maaf, Kamu tidak bisa memesan pada hari Selasa, karena itu untuk Oldest Night";
            }
            }else if(hari.equalsIgnoreCase("Rabu")){
                if(jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 35 && penampilan >=8 && uang >= 300) {
                    result= "Reservasi Sukses, Kamu bisa memesan di hari Rabu, Ladies Night.";
                }else {
                    result ="Maaf, Kamu tidak bisa memesan pada hari Rabu, karena itu untuk Ladies Night";
                }
            }else if(hari.equalsIgnoreCase("Kamis")){
                if(jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 21 && umur <= 30 && penampilan >=8 && uang >= 300) {
                    result = "Reservasi Sukses, Kamu bisa memesan di hari Kamis, Party Night For Single.";
                }else if(jeniskelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && uang >= 1000) {
                    result = "Reservasi Sukses, Kamu bisa memesan di hari Kamis, Party Night For Single.";
                }else {
                     result ="Maaf, Kamu tidak bisa memesan pada hari Kamis, karena itu untuk Party Night For Single";
                }
            }else if(hari.equalsIgnoreCase("Jumat")){
                if(jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 31 && umur <= 45 && uang >= 1000) {
                     result = "Reservasi Sukses, Kamu bisa memesan di hari Jumat, Women Night.";
                }else if(jeniskelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 25 && penampilan >= 8) {
                     result = "Reservasi Sukses, Kamu bisa memesan di hari Jumat, Women Night.";
                }else {
                    result ="Maaf, Kamu tidak bisa memesan pada hari Jumat, karena itu untuk Women Night";
                }
            }else if(hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu") ){
                if(umur >=18 && umur <= 60 && uang >=100){
                    result = "Reservasi Sukses, Kamu bisa memesan di Akhir Pekan, Weekend Freedom.";
                } else {
                    result ="Maaf, Kamu tidak bisa memesan pada akhir pekan, karena itu untuk Weekend Freedom.";
                }

            }

            System.out.println();
            System.out.println("Hai"  +nama+ ",Terimakasih sudah menggunakan aplikasi kami" );
            System.out.println("Berikut ini hasil dari reservasi mu :");
            System.out.println(result);
    }
}
