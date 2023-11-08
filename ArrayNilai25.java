import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inisialisasi dan instasiasi
        int [] nilaiAkhir = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }

    }
}
