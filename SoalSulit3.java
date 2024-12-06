import java.util.Scanner;

public class SoalSulit3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENGHITUNG FREKUENSI ELEMEN DI ARRAY");
        System.out.print("Masukkan Jumlah array : ");
        int n = input.nextInt();        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Elemen ke-" + (i + 1) + " = " + arr[i]);
                }
            }
        }
    }
}