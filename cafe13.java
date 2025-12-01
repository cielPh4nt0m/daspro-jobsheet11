import java.util.Scanner;

public class cafe13 {
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItems, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItems;
        double diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = hargaTotal * 0.5;
            System.out.println("Diskon 50%: Rp " + (int) diskon);
        } 
        else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = hargaTotal * 0.3;
            System.out.println("Diskon 30%: Rp " + (int) diskon);
        } 
        else {
            System.out.println("Kode promo invalid, tidak ada diskon.");
        }

        return (int) (hargaTotal - diskon);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalKeseluruhan = 0;
        boolean lanjut = true;

        System.out.print("Masukkan kode promo (DISKON50 / DISKON30 / LAINNYA): ");
        String kodePromo = sc.nextLine();

        while (lanjut) {

            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItems = sc.nextInt();
            sc.nextLine();

       
            int totalPerMenu = hitungTotalHarga(pilihanMenu, banyakItems, kodePromo);
            totalKeseluruhan += totalPerMenu;

            System.out.print("Apakah ingin memesan menu lain? (yes/no): ");
            String jawab = sc.nextLine();

            if (jawab.equalsIgnoreCase("no")) {
                lanjut = false;
            }
        }

  
        System.out.println("\n=======================================");
        System.out.println("Total keseluruhan pesanan: Rp " + totalKeseluruhan);
        System.out.println("=======================================");
    }
}
