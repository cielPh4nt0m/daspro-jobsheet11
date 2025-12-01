## JOBSHEET 11 FUNGSI 1

###  Percobaan 1: Membuat Fungsi Tanpa Parameter 

1. Apakah fungsi tanpa parameter selalu harus bertipe void?

   Jawaban :
```
public class kafe13 {
    public static void Menu() {
        System.out.println("=====Menu Resto Kafe=====");
        System.out.println("1. Kopi HItam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp  12,000");
        System.out.println("Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    } 
    public static void main(String[] args) {
        Menu();
    }     
}
```
Tidak semua fungsi tanpa parameter harus bertipe void, alasannya adalah tanpa parameter berarti fungsi tidak menerima input dan tipe void berarti fungsi tidak mengembalikan nilai

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!

Jawaban : 

Bisa, daftar menu dapat ditampilkan tapa menggunakan fungsi Menu(). dengan menempatkan semua isi di fungsi menu() langsung ke dalam fungsi main()

before : 

<img width="802" height="489" alt="Screenshot 2025-11-24 135954" src="https://github.com/user-attachments/assets/0df69c9d-1a54-475c-99cb-41be31e27b06" />

After : 

<img width="784" height="445" alt="Screenshot 2025-11-24 140023" src="https://github.com/user-attachments/assets/511fd154-b3d4-47ee-ad72-a4eb028c7532" />

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.

   Jawaban :

   1. Kode lebih rapi dan terstruktur :Dengan memisahkan menu ke dalam fungsi sendiri, main() menjadi lebih bersih dan mudah dibaca.
  
   2. Mengurangi duplikasi kode : Jika menu perlu ditampilkan lebih dari sekali (misalnya setelah transaksi selesai, atau saat user ingin kembali ke menu awal), Anda cukup memanggil:

   3. Lebih mudah perawatan (maintenance): Jika ingin mengubah harga atau menambah daftar menu, cukup ubah di satu tempat saja (di dalam Menu()). Jika ditulis langsung di main(), perubahan bisa terjadi di banyak tempat.

   4. Mendukung pemrograman modular: Pemrograman yang baik memecah program menjadi bagian-bagian kecil yang memiliki tugas spesifik.Fungsi Menu() memiliki satu tugas: menampilkan menu.
      
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() diipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar)

   Jawaban :

   (1). program dijalankan,
   (2). Masuk ke fungsi main()Eksekusi dimulai dari baris pertama di dalam main(),
   (3). Pemanggilan fungsi Menu() JVM berhenti sejenak menjalankan main() dan melompat ke fungsi Menu(),
   (4). Masuk ke fungsi Menu() JVM mulai mengeksekusi semua perintah yang ada di dalam fungsi Menu(),
   (5). Menampilkan menu ke layar Setiap baris System.out.println() dijalankan berurutan sehingga daftar menu tercetak ke layar:,
   (6). Fungsi Menu() selesai dieksekusi Setelah baris terakhir fungsi Menu() selesai dijalankan, JVM kembali ke tempat terakhir di main(),
   (7). main() selesai → program berhenti Karena tidak ada kode lain setelah pemanggilan Menu(), program selesai dan Java menghentikan eksekusi.

###  Percobaan 2: Membuat Fungsi Dengan Parameter

1. Apakah kegunaan parameter di dalam fungsi?

   Jawaban :

   kegunaannya adalah mengirimkan data ke dalam fungsi kemudian membuat fungsi lebih fleksibel dan reusable, mencegah duplikasi kode, membantu fungsi melakukan tugas data yang tepat dan memperjelas alur data dalam program.
   
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?

   Jawaban : Fungsi Menu() menggunakan parameter namaPelanggan dan isMember karena:

   1. Untuk menampilkan nama pelanggan secara dinamis
   2. UNtuk menampilkan pelanggan apakah member atau bukan
   3. Agar fungsi lebih flexsibel dan dapat digunakan kembali
   
3. Apakah parameter sama dengan variabel? Jelaskan.

   Jawaban :

   Parameter dan variabel tidak sama namun mereka saling terkait, parameter adalah variabel yang ada di dalam tanda kurung fungsi/metode dan digunakan untuk menerima nilai dari luuar ketik fungsi di panggilkan sedangka variabel adalah tempat menyimpan data yang bisa dibuat dimana saja dalam program.

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?

   Jawaban :

   Parameter ismember pada fungsi menu() berfungsi sebagai penanda yang menentukan apakah seseorang pelanggan termask anggota member atau tidak. Nilai parameter ini berupa boolean, yaitu hanya dapat bernilai true atau false, sehingga sangat cocok digunakan untuk membuat keputusan sederhana dalam program. Ktika fungsi menu() dipanggil, nilai yang digunakan pada isMember akan dibaca oleh program untuk memutuskan adakah perlu ditampilkan informasi mengenai diskon atau tidak. di dalam fungsi memiliki perintah if (isMember), yang dimana program bahwa hanya akan menjalankan kode di dalam blok tersebut jika bernilai isMember adalah true. Jika nilai yang diberikan adalah true, maka program menampilkan pesan bahwa pelanggan berhak mendapatkan diskon 10% sebagai member. Sebaliknya, jika isMember bernilai false, maka kondisi tersebut tidak terpenuhi dan kode di dalam blok if dilewati, sehingga tidak ada pesan diskon yang muncul. Dengan cara ini, parameter isMember membuat fungsi menjadi lebih fleksibel karena output yang dihasilkan dapat berubah sesuai status pelanggan. Program tidak perlu dibuat dua versi yang berbeda antara member dan non-member; cukup menggunakan satu fungsi dengan parameter yang dapat diisi sesuai kebutuhan.
   
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?

   Jawaban :

   Jika fungsi Menu() dipanggil tanpa menyertakan parameter namaPelanggan dan isMember, maka program akan mengalami error (kesalahan) saat dikompilasi. Hal ini terjadi karena fungsi Menu() telah didefinisikan dengan dua parameter yang wajib diisi, Artinya, setiap kali fungsi tersebut dipanggil, Java mengharuskan kita mengirim dua nilai, satu untuk namaPelanggan dan satu lagi untuk isMember. tanpa memberikan nilai apa pun, Java tidak dapat menemukan fungsi Menu() versi lain yang tidak memiliki parameter. Karena tidak ada kecocokan antara cara pemanggilan dan definisi fungsi, maka Java akan menampilkan pesan compile-time error,Dengan kata lain, program tidak akan bisa dijalankan sama sekali. Untuk menghindari error, pemanggilan fungsi harus selalu mengikuti definisi parameternya, Parameter membuat fungsi menjadi lebih fleksibel, tetapi juga memberikan aturan bahwa nilai-nilai tersebut harus disediakan setiap kali fungsi dipanggil.

6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.

   Jawaban :

   <img width="1191" height="829" alt="Screenshot 2025-11-25 025002" src="https://github.com/user-attachments/assets/5037e9af-ff50-4a52-840b-4d1d2dad3c28" />


7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.

    Jawaban :

   <img width="686" height="84" alt="Screenshot 2025-11-25 025137" src="https://github.com/user-attachments/assets/b9947754-b145-4d99-946f-a5b5214513a4" />

   Hasilnya :

   <img width="598" height="278" alt="Screenshot 2025-11-25 025157" src="https://github.com/user-attachments/assets/4823b042-64fe-460f-a87f-fb801012105e" />

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.

   Jawaban :

   Ya, penggunaan parameter namaPelanggan dan isMember membuat program lebih mudah dibaca dan dikembangkan karena fungsi menjadi fleksibel dan bisa digunakan ulang untuk berbagai pelanggan tanpa mengubah kode di dalamnya. Jika nilai ditulis langsung di dalam fungsi, setiap perubahan harus mengedit fungsi itu sendiri, sehingga kode kurang efisien dan sulit dirawat.

###   Percobaan 3:  Membuat Fungsi dengan Nilai Kembalian

1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.

   Jawaban :

   1. Fungsi yang membutuhkan nilai kembalian (return value)

Suatu fungsi membutuhkan nilai kembalian jika hasil perhitungan atau proses di dalam fungsi tersebut masih akan digunakan kembali oleh bagian program lain—misalnya untuk disimpan dalam variabel, ditampilkan, atau diproses lagi.

Contoh dari program kafe (Percobaan 3):
```
public static int hitungTotalHarga(int pilihanMenu, int banyakItems) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItems;
    return hargaTotal;   // nilai dikembalikan ke pemanggil
}
```
Fungsi hitungTotalHarga() mengembalikan nilai total harga, yang kemudian digunakan di main():
```
int totalHarga = hitungTotalHarga(pilihanMenu, banyakItems);
```
2. Fungsi yang tidak membutuhkan nilai kembalian (void)

Fungsi tidak membutuhkan nilai kembalian jika tugasnya hanya melakukan aksi, seperti menampilkan output, membaca input, atau mengubah data tanpa perlu memberikan hasil kembali ke pemanggil.

Contoh fungsi void untuk program kafe (modifikasi sederhana)

Misalnya kita membuat fungsi untuk menampilkan daftar menu:
```
public static void tampilkanMenu() {
    System.out.println("=== Daftar Menu Kafe ===");
    System.out.println("1. Kopi Hitam    - Rp 15000");
    System.out.println("2. Cappuccino    - Rp 20000");
    System.out.println("3. Latte         - Rp 22000");
    System.out.println("4. Teh Manis     - Rp 12000");
    System.out.println("5. Air Mineral   - Rp 10000");
    System.out.println("6. Coklat Panas  - Rp 18000");
}
```
Fungsi ini hanya menampilkan menu dan tidak perlu mengembalikan nilai apa pun.

Pemanggilannya di main:

tampilkanMenu();
  
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.

   Jawaban :

   1. Tipe data nilail kembalian : Fungsi hitungTotalHargaNoAbsen mengembalikan tipe data int.Fungsi ini menghasilkan angka bilangan bulat yaitu total harga yang dimana harus dibayar pelanggan.
  
   2. Dua Parameter yang digunakan :

       parameternya adalah :

      A. int pilihanMenu
      - Merupakan nomor menu yang dipilih pelanggan.
      - nilai ini dipakai untuk menentukan harga per item dari array harga
        
      B. int jumlahPesanan
      - Merupakan jumlah item yang ingin dibeli pelanggan
      - nilai ini digunakan untuk menghitung total harga

3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.

   Jawaban :

   <img width="984" height="996" alt="Screenshot 2025-11-25 143848" src="https://github.com/user-attachments/assets/927b4571-cd74-49ef-b681-3ad77e7273d9" />

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)? 

Jawaban : 
```
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

        
        int totalSetelahDiskon = (int) (hargaTotal - diskon);
        return totalSetelahDiskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalKeseluruhan = 0;
        boolean lanjut = true;

        System.out.print("Masukkan kode promo (DISKON50 / DISKON30 / LAINNYA): ");
        String kodePromo = sc.nextLine();

        while (lanjut) {}

        System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItems = sc.nextInt();

        int totalPermenu = hitungTotalHarga(pilihanMenu, banyakItems, kodePromo);
        totalKeseluruhan += totalPermenu;

        System.out.println("Apakah ingin memesan menu lain? (yes/no): ");
        sc.nextLine(); 
        String jawab = sc.nextLine();

        if (jawab.equalsIgnoreCase("no")) {
            lanjut = false;
        }

        System.out.println("\n=======================================");
        System.out.println("Total keseluruhan pesanan: Rp " + totalKeseluruhan);
        System.out.println("\n=======================================");
    }
}
```

Hasilnya : 

<img width="531" height="336" alt="Screenshot 2025-11-25 152206" src="https://github.com/user-attachments/assets/0edaec6e-f29b-471f-88b7-33aba5bc07e8" />

## Percobaan 4: Fungsi Varargs

1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...namaPengunjung!

   Jawaban :

   Parameter String...namaPengunjung digunakan untuk membuat metode lebih fleksibel sehingga bisa menerima banyak argumen String tanpa harus membuat array secara manual. Metode ini tetap di akses seperti array di dalam body metode
   
2. Modifikasi method daftarPengunjung menggunakan for-each loop.

   Jawaban :

   <img width="802" height="355" alt="Screenshot 2025-11-25 160335" src="https://github.com/user-attachments/assets/95c4df95-1d61-4fa9-bd2e-b706219db48e" />

   
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!

   Jawaban :

   Tdak bisa, java tidak menginzinkan 2 parameter varags dalam satu fungsi, karena berkaitan dengan aturan dasar varags dan cara compailer menangani parameter varags.

   Contohnya :

   Dalam Java, varargs (variable-length argument) dideklarasikan dengan:
```
type... name
```
Java hanya mengizinkan satu varargs per method, dan varargs harus berada di posisi terakhir dalam parameter list.

Karena varargs pada dasarnya diperlakukan sebagai array tunggal oleh compiler.
Jika diperbolehkan dua varargs, contoh:
```
void test(int... a, String... b)
```
Compiler tidak akan bisa membedakan mana argumen yang masuk ke varargs pertama dan mana ke yang kedua, sehingga menimbulkan ambigu dalam pemanggilan fungsi.
   
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen.Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan?Jika tetap berjalan, bagaimana output yang dihasilkan?

   Jawaban :

   Jika daftar pengunjung dipanggil tanpa argumen program tetap berjalan. parameter String...nama pengunjung artinya bisa menerima berapapun jumlah argumen, java akan memperlakukan pemanggilan tanpa argumen sebagai pengirimnya array berstirng ukuran 0. Kompilator tidak keberatan dan saat dijalankan pun tidak ada masalah pada loop. Loop for hanya tidak mengeksekusi isi tubunya karena array koosong.

   OUTPUT YANG DIHASILKAN :
   ```
   Daftar Nama Pengunjung:
   ```

## Percobaan 5: Pembuatan Kode Program, dengan Fungsi versus Tanpa Fungsi Waktu 

1.	Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!

   Jawaban : 

   a. program dijalankan(eksekusi dimulai dari tahap method main)

   b. Membuat objek scanner(untuk membaca input)

   c. Deklarasi variabel(menyiapkan variable untuk menampung nilai panjang,lebar,tinggi dan volume)

   d. meminta dan membaca nilai 

   e. meminta dan membaca nilai lebar 

   f. mrminta dan membaca nilai tinggi

   g. mrmanggil method hitung luas(p, l)

   h. memanggil method hitung volume(t, p, l)

   i. menutup scanner

   j. menrunkan codingan 

   k. hasil output keluar
   
2.	Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.

   Jawaban :

   Ketika program dijalankan, eksekusi dimulai dari method main(). Program kemudian meminta pengguna untuk memasukkan nilai panjang, lebar, dan tinggi balok. Setelah pengguna memasukkan panjang 4, lebar 3, dan tinggi 5, program memanggil method hitungLuas(4, 3) untuk menghitung luas alas persegi panjang. Di dalam method tersebut, nilai luas dihitung dengan rumus 4 * 3 sehingga diperoleh hasil 12, kemudian nilai ini dikembalikan ke method main() dan ditampilkan sebagai “Luas persegi panjang adalah 12”. Selanjutnya, program memanggil method hitungVolume(5, 4, 3) untuk menghitung volume balok. Method ini terlebih dahulu memanggil kembali hitungLuas(4, 3) untuk mendapatkan luas alas, yaitu 12, kemudian mengalikan hasil tersebut dengan tinggi 5, menghasilkan volume 60. Nilai ini dikembalikan ke main() dan ditampilkan sebagai “Volume balok adalah 60”. Setelah semua output ditampilkan, program selesai dijalankan.

3.	Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!

   Jawaban : 

  Program dimulai dengan memanggil metode sum(1, 1) di dalam fungsi utama, yang menghitung penjumlahan 1 dan 1, menghasilkan nilai 2, yang kemudian disimpan di dalam variabel temp. Selanjutnya, program memanggil metode DisplaySum(temp, 5), yang setara dengan memanggil DisplaySum(2, 5). Di dalam metode DisplaySum, program memanggil metode sum(2, 5) lagi untuk menghitung jumlah kedua nilai ini, yaitu 2 + 5 = 7. Nilai 7 ini kemudian diteruskan sebagai argumen ke metode DisplayUpTo(7). Metode ini menjalankan sebuah loop dari j = 1 sampai j = 7, dan dalam setiap iterasi, program mencetak karakter "j" tanpa pindah ke baris baru. Karena loop berjalan sebanyak 7 kali, output akhir dari program adalah rangkaian tujuh huruf 'j' yang muncul berturut-turut sebagai jjjjjjj. ...
  
4.	Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!

   Jawaban : 

   Fungsi perlu menggunakan parameter ketika ingin mengirim data dari luar fungsi supaya fungsi bisa bekerja dengan nilai tersebut. Kalau fungsi hanya melakukan sesuatu yang tidak dibutuhkan oleh data dari luar maka fungsi tidak perlu parameter.

   Fungsi hanya perlu memiliki nilai kembalian jika kita membuktikan hasil dari proses yang dilakukan fungsi tesebut untuk dipakai lagi pada bagian program lain.

5.	Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.

   Jawaban : 

 Fungsi hitungLuas dan hitungVolume dimana kita memahami kapan sebuah fungsi perlu memakai parameter dan kapan tidak. Fungsi hitungLuas menggunakan parameter karena fungsi ini mebutuhkan nilai panjag dan lebar dari luar fungsi untuk menghitung luas. Fungsi ini butuh tiga nilai, yaitu tinggi serta panjang dan lebar, supaya bisa menghitung volume balok. Karena nilai-nilai itu berasal dari input pengguna, maka fungsi harus menerima parameter agar bisa memproses.

 Sebuah fungsi boleh tanpa paramater jika fungsi tersebut tidak membutuhkan data dari luar dan sudah memiliki seua informasi yang dibutuhkan di dalam dirinya sendiri. 
 
6.	Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.

   Jawaban : 

Fungsi sebaiknya memiliik nilai kembalian jika hasil dari proses di dalalm fungsi tersebut masih diperlukan oleh bagian program lain. Sebaliknya fungsi tidak perlu memilki nilai kembalian jika tugasnya hanya melakukan aksi tanpa harus mengirim hasil apapun

### TUGAS 

1.	Buatlah sebuah class KubusNoAbsen yang di dalamnya terdapat fungsi untuk menghitung volume kubus dan luar permukaan kubus!

   Jawaban : 

   <img width="948" height="527" alt="Screenshot 2025-12-01 214443" src="https://github.com/user-attachments/assets/aeee3a70-e9fe-4e8b-9ba3-b660ca50957b" />

  outputnya : 

  <img width="248" height="150" alt="Screenshot 2025-12-01 214521" src="https://github.com/user-attachments/assets/30597d56-d06d-41e6-883c-4f0c72d73e7a" />

2.	Di suatu kelas, terdapat N mahasiswa yang mengikuti satu mata kuliah. Nilai tiap mahasiswa untuk mata kuliah tersebut akan diinputkan oleh pengguna dan disimpan dalam sebuah array 1 dimensi berukuran N. Buatlah sebuah class NilaiMahasiswaNoAbsen yang di dalamnya terdapat beberapa fungsi berikut: a. Fungsi isianArray untuk:

- 	Mengisi elemen-elemen array dengan nilai yang diinputkan oleh user (jumlah elemen = N, dibaca dari input)
  
b.	Fungsi tampilArray untuk: 

-	Menerima parameter berupa array nilai mahasiswa
  
-	Menampilkan seluruh nilai yang telah diinputkan
   
c.	Fungsi hitTot untuk: 

-	Menerima parameter berupa array nilai mahasiswa
  
-	Menghitung dan mengembalikan total nilai seluruh mahasiswa (return tipe int atau double)
   
d.	Fungsi main untuk: 

-	Membaca nilai N (jumlah mahasiswa) dari input pengguna
  
-	Membuat array dengan ukuran N
  
-	Memanggil fungsi isianArray, tampilArray, dan hitTot
  
-	Menampilkan total nilai yang dikembalikan oleh fungsi hitTot

 Jawaban : 
 ```
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
 ```
 Outputnya : 
```
Masukkan jumlah mahasiswa: 3
Masukkan nilai mahasiswa ke-1: 80
Masukkan nilai mahasiswa ke-2: 75
Masukkan nilai mahasiswa ke-3: 90
Nilai mahasiswa:
80 75 90 
Total nilai: 245
```
3.	Ibu Mariana mengelola sebuah kafe. Berikut adalah rekap penjualan 5 menu dari hari pertama hingga ketujuh: 

   <img width="889" height="222" alt="image" src="https://github.com/user-attachments/assets/401faa98-d480-44c6-a9fe-2f568d7201cd" />

   a. Buatlah sebuah class RekapPenjualanCafeNoAbsen yang digunakan untuk menyimpan dan mengolah data penjualan 5 menu kafe dari hari pertama hingga hari ketujuh. Di dalam class tersebut, buat dan gunakan beberapa fungsi (method) berikut: 
   
 -	Fungsi untuk menginputkan data penjualan setiap menu untuk setiap hari (petunjuk: menggunakan array 2 dimensi).
   
-	Fungsi untuk menampilkan seluruh data penjualan dari hari pertama hingga hari terakhir dalam bentuk tabel
  
-	Fungsi untuk menampilkan menu yang memiliki total penjualan tertinggi selama tujuh hari (tampilkan nama menu dan total penjualannya).
  
-	Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu selama tujuh hari (tampilkan nama menu dan nilai rata-ratanya).
  
Gunakan fungsi main untuk: 

-	Memanggil fungsi input data penjualan,
  
-	Menampilkan seluruh data penjualan,
  
-	Menampilkan menu dengan penjualan tertinggi, dan

-	Menampilkan rata-rata penjualan untuk setiap menu. 
 
c.	Modifikasi program pada 3 (a) sehingga jumlah hari penjualan dan jumlah menu dibaca dari input pengguna, lalu sesuaikan ukuran array dan proses perhitungan agar tetap berjalan dengan benar. 

Jawaban : 
```
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
```
Outputnya : 
```
=== PROGRAM REKAP PENJUALAN CAFE ===
Masukkan jumlah menu: 5
Nama menu ke-1: kopi
Nama menu ke-2: teh 
Nama menu ke-3: es kelapa muda
Nama menu ke-4: roti bakar
Nama menu ke-5: gorengan
Masukkan jumlah hari penjualan: 7

=== INPUT DATA PENJUALAN ===
Menu: kopi
  Hari ke-1: 20
  Hari ke-2: 20
  Hari ke-3: 25
  Hari ke-4: 20
  Hari ke-5: 10
  Hari ke-6: 60
  Hari ke-7: 10

Menu: teh
  Hari ke-1: 30
  Hari ke-2: 80
  Hari ke-3: 40
  Hari ke-4: 10
  Hari ke-5: 15
  Hari ke-6: 20
  Hari ke-7: 25

Menu: es kelapa muda
  Hari ke-1: 5
  Hari ke-2: 9
  Hari ke-3: 10
  Hari ke-4: 25
  Hari ke-5: 10
  Hari ke-6: 5
  Hari ke-7: 45

Menu: roti bakar
  Hari ke-1: 50
  Hari ke-2: 8
  Hari ke-3: 17
  Hari ke-4: 18
  Hari ke-5: 10
  Hari ke-6: 30
  Hari ke-7: 6

Menu: gorengan
  Hari ke-1: 15
  Hari ke-2: 10
  Hari ke-3: 16
  Hari ke-4: 15
  Hari ke-5: 10
  Hari ke-6: 10
  Hari ke-7: 55


=== TABEL DATA PENJUALAN ===
Menu/Hari       H1      H2      H3      H4      H5      H6      H7
kopi    20      20      25      20      10      60      10
teh     30      80      40      10      15      20      25
es kelapa muda  5       9       10      25      10      5       45
roti bakar      50      8       17      18      10      30      6
gorengan        15      10      16      15      10      10      55

=== MENU PENJUALAN TERTINGGI ===
Menu: teh
Total Penjualan: 220

=== RATA-RATA PENJUALAN MENU ===
kopi : 23.571428571428573
teh : 31.428571428571427
es kelapa muda : 15.571428571428571
roti bakar : 19.857142857142858
gorengan : 18.714285714285715
```


   







