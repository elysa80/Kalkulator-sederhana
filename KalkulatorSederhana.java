package kalkulator.sederhana;
import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double a, b, hasil;

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Akar Kuadrat");
        System.out.println("6. Kuadrat (Pangkat 2)");
        System.out.print("Pilih operasi (1-6): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan angka pertama: ");
                a = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                b = input.nextDouble();
                hasil = a + b;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;

            case 2:
                System.out.print("Masukkan angka pertama: ");
                a = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                b = input.nextDouble();
                hasil = a - b;
                System.out.println("Hasil pengurangan: " + hasil);
                break;

            case 3:
                System.out.print("Masukkan angka pertama: ");
                a = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                b = input.nextDouble();
                hasil = a * b;
                System.out.println("Hasil perkalian: " + hasil);
                break;

            case 4:
                System.out.print("Masukkan angka pertama: ");
                a = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                b = input.nextDouble();
                if (b != 0) {
                    hasil = a / b;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Error: Tidak bisa dibagi dengan nol!");
                }
                break;

            case 5:
                System.out.print("Masukkan angka: ");
                a = input.nextDouble();
                hasil = Math.sqrt(a);
                System.out.println("Hasil akar kuadrat dari " + a + " adalah: " + hasil);
                break;

            case 6:
                System.out.print("Masukkan angka: ");
                a = input.nextDouble();
                hasil = Math.pow(a, 2);
                System.out.println("Hasil kuadrat dari " + a + " adalah: " + hasil);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
