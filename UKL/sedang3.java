import java.util.Random;
import java.util.Scanner;

public class sedang3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            int bilanganPertama = random.nextInt(5) + 1;
            int bilanganKedua = random.nextInt(5) + 1;

            int operator = random.nextInt(3);
            String operatorString;
            switch (operator) {
                case 0:
                    operatorString = "*";
                    break;
                case 1:
                    operatorString = "/";
                    break;
                case 2:
                    operatorString = "%";
                    break;
                default:
                    operatorString = "*";
            }

            System.out.print(bilanganPertama + " " + operatorString + " " + bilanganKedua + " = ");


            int jawaban = scanner.nextInt();

            int hasil;
            switch (operator) {
                case 0:
                    hasil = bilanganPertama * bilanganKedua;
                    break;
                case 1:
                    hasil = bilanganPertama / bilanganKedua;
                    break;
                case 2:
                    hasil = bilanganPertama % bilanganKedua;
                    break;
                default:
                    hasil = bilanganPertama * bilanganKedua;
            }
            

            System.out.println("Hasil: " + hasil);

            if (jawaban == hasil) {
                System.out.println("jawaban anda benar");
            } else {
                System.out.println("jawaban anda salah" );
            }

            System.out.print("Ingin berhenti? (y/n): ");
            String pilihan = scanner.next();
            if (pilihan.equalsIgnoreCase("y")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
        }
    }
}