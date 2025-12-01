import java.util.Scanner;

public class RekapPenjualanCafe13 {

    static Scanner sc = new Scanner(System.in);

    // Fungsi input data penjualan
    static void inputPenjualan(int[][] data, String[] menu) {
        System.out.println("\n=== INPUT DATA PENJUALAN ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // Fungsi menampilkan tabel penjualan
    static void tampilkanData(int[][] data, String[] menu) {
        System.out.println("\n=== TABEL DATA PENJUALAN ===");
        System.out.print("Menu/Hari\t");

        for (int i = 1; i <= data[0].length; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi mencari menu dengan total penjualan tertinggi
    static void menuTertinggi(int[][] data, String[] menu) {
        int maxTotal = -1;
        int indexMax = -1;

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }

        System.out.println("\n=== MENU PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[indexMax]);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    // Fungsi menampilkan rata-rata per menu
    static void rataRataMenu(int[][] data, String[] menu) {
        System.out.println("\n=== RATA-RATA PENJUALAN MENU ===");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = (double) total / data[i].length;

            System.out.println(menu[i] + " : " + rata);
        }
    }

    // MAIN PROGRAM
    public static void main(String[] args) {

        System.out.println("=== PROGRAM REKAP PENJUALAN CAFE ===");

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); // buang enter

        String[] menu = new String[jumlahMenu];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = sc.nextInt();

        int[][] data = new int[jumlahMenu][jumlahHari];

        inputPenjualan(data, menu);
        tampilkanData(data, menu);
        menuTertinggi(data, menu);
        rataRataMenu(data, menu);
    }
}

