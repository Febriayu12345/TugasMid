import java.util.Scanner;

public class Hitung0071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta user untuk memasukkan nilai mil
        System.out.print("Masukkan nilai mil: ");
        double mil = input.nextDouble();
        
        // Konversi mil menjadi meter
        double meter = mil * 1609.0;
        
        // Menampilkan hasil konversi
        System.out.println(mil + " mil = " + meter + " meter");
    }
}