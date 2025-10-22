# JavaSimpleProject
codelab modul 3 proglan
💡 Gambaran Umum

Program ini adalah aplikasi perpustakaan digital sederhana berbasis console yang menggunakan bahasa Java.
Tujuannya adalah untuk mengelola data buku, seperti menambah, melihat, mencari, dan menghapus buku dari daftar perpustakaan.

🧩 Struktur Program

Program terdiri dari tiga bagian utama:

Class Book → merepresentasikan data satu buku

Class Library → mengelola kumpulan buku

Class Main → tempat menjalankan program dan menampilkan menu ke pengguna

📘 Class Book

Bagian ini berfungsi untuk menyimpan informasi dari setiap buku, seperti:

Judul buku

Nama penulis

Tahun terbit

Data disimpan secara terpisah untuk setiap buku, dan ditampilkan dengan format yang rapi agar mudah dibaca.
Class ini juga memiliki fungsi untuk mengambil judul buku (digunakan saat mencari atau menghapus buku).

🏛️ Class Library

Bagian ini berperan sebagai pengelola koleksi buku.
Semua buku yang ditambahkan pengguna akan disimpan dalam sebuah ArrayList, yaitu struktur data seperti daftar yang bisa menampung banyak objek buku.

Fungsi-fungsi utama di dalamnya meliputi:

Menambah buku → menambahkan data buku baru ke daftar

Menampilkan semua buku → menampilkan seluruh koleksi buku yang tersimpan

Mencari buku → menemukan buku berdasarkan kata kunci dari judul

Menghapus buku → menghapus buku berdasarkan judulnya

Jika pengguna belum menambahkan buku, program akan menampilkan pesan bahwa perpustakaan masih kosong.

💻 Class Main

Bagian ini adalah pusat program yang berjalan di layar console.
Di sini, pengguna akan melihat menu interaktif yang terdiri dari lima pilihan:

Tambah buku

Lihat semua buku

Cari buku

Hapus buku

Keluar

Program akan terus menampilkan menu tersebut hingga pengguna memilih opsi keluar.

Ketika pengguna memilih salah satu menu, program akan meminta data seperti judul, penulis, atau tahun buku, lalu menampilkan hasil sesuai pilihan tersebut.

⚙️ Konsep Pemrograman yang Digunakan

Program ini menerapkan beberapa konsep penting dalam pemrograman berorientasi objek (OOP), seperti:

Enkapsulasi (Encapsulation) → data buku disembunyikan agar tidak bisa diubah langsung dari luar.

ArrayList → digunakan untuk menyimpan dan mengelola banyak data buku secara dinamis.

Method → digunakan untuk memisahkan logika (misalnya menambah atau mencari buku).

Looping dan Switch-case → digunakan untuk mengatur menu dan pilihan pengguna.

📚 Kesimpulan

Program ini menggambarkan bagaimana konsep OOP diterapkan untuk membuat sistem sederhana.
Dengan fitur tambah, lihat, cari, dan hapus buku, program ini bisa dijadikan dasar untuk membangun aplikasi perpustakaan digital yang lebih kompleks — misalnya versi GUI (dengan tampilan tombol dan form) atau web (menggunakan database dan server).