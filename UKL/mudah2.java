import java.util.Scanner;

public class mudah2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan sebuah bilngan: ");
        int bilangan = scanner.nextInt();

        if ( bilangan% 2 == 0) {
            System.out.println(bilangan + "adalah bilangan genap.");
        }else{
            System.out.println(bilangan + "adalah bilngan ganjil.");
            scanner.close();


        }
        
    }

    
}