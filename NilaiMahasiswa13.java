import java.util.Scanner;

 public class NilaiMahasiswa13 {
    
    //isi array dengan nilai dari user 
    static void isianArray(int[] nilai) {
        Scanner cs = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ":");
            nilai[i] =cs.nextInt();
        }
    }

    //menampilkan isi array
     static void tampilArray(int[] nilai) {
        System.out.println("Nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();
    }
    
    //hitung total nilai
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] arrNilai = new int[N];

        isianArray(arrNilai);
        tampilArray(arrNilai);

        int total = hitTot(arrNilai);
        System.out.println("Total nilai: " + total);

        sc.close();
    }
 }