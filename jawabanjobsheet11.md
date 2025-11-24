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

   Jawaban : 
   
4. Apakah parameter sama dengan variabel? Jelaskan.

5. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
  
6. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?

7. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.

8. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.

9. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.

###   Percobaan 3:  Membuat Fungsi dengan Nilai Kembalian

1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
  
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.

3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)? 

