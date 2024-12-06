
import java.util.Scanner;

public class sulit1  {
    public static double ratarata(double TotalNilai, double JumlahSiswa){
        return TotalNilai/JumlahSiswa;
    }
    public static void main(String[] args) {
        int JumlahSiswa;
        double Nilai, TotalNilai=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Masukan Jumlah siswa");
        JumlahSiswa = s.nextInt();
         
        for (int i = 1; i <=JumlahSiswa; i++){
            System.out.println("Nilai siswa" + i + ":");
            Nilai = s.nextDouble();
            TotalNilai += Nilai;
          
        }

        double rata = ratarata(TotalNilai, JumlahSiswa);
        System.out.println("Total Nilai: "+TotalNilai);
        System.out.println("Rata-Rata Nilai: " + rata );

        s.close();
    }
}