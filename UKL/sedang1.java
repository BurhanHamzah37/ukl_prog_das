import java.util.Scanner;

public class sedang1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

     if (bilangan < 0) {
        System.out.println("bilangan harus positif!");
    }else{
        long faktorial = 1;
        for (int i = 1; i <= bilangan; i++){
            faktorial *= i;
            System.out.println("Faktorial dari " + bilangan + "adalah" + faktorial);
            scanner.close();
        }
        

    
        
    }
}
}