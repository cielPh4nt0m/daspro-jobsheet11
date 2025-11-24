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
  
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.

3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)? 


