import java.util.Scanner;

public class sulit3 {
    public static void main(String[] args) {
        Scanner averil = new Scanner(System.in);

        System.out.print("Masukkan jumlah Array: ");
        int jumlaharray = averil.nextInt();
        int[] array = new int[jumlaharray];
        boolean[] checked = new boolean[jumlaharray];
        System.out.println("Masukkan elemen Array:");
        for (int i = 0; i < jumlaharray; i++) {
            array[i] = averil.nextInt();
        }

        System.out.println("Frekuensi elemen dalam array:");
        for (int i = 0; i < jumlaharray; i++) {
            if (!checked[i]) {
                int count = 1;
                for (int j = i + 1; j < jumlaharray; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        checked[j] = true;
                    }
                }
                System.out.println(array[i] + " muncul " + count + " kali");
            }
        }

        averil.close();
    }
}