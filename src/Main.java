import java.util.ArrayList;
import java.util.Scanner;

// Class untuk merepresentasikan buku
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "📘 Judul: " + title + " | ✍️ Penulis: " + author + " | 📅 Tahun: " + year;
    }
}

// Class untuk menyimpan dan mengelola buku
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ Buku berhasil ditambahkan!");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("⚠️ Belum ada buku di perpustakaan.");
        } else {
            System.out.println("\n=== 📚 Daftar Buku ===");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("🔍 Ditemukan: " + b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ Buku tidak ditemukan.");
        }
    }

    public void deleteBook(String title) {
        boolean removed = books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("🗑️ Buku berhasil dihapus.");
        } else {
            System.out.println("❌ Buku tidak ditemukan.");
        }
    }
}

// Class utama
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== 📖 Perpustakaan Digital =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Semua Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul: ");
                    String title = input.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String author = input.nextLine();
                    System.out.print("Masukkan tahun: ");
                    int year = input.nextInt();
                    input.nextLine();
                    library.addBook(new Book(title, author, year));
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    System.out.print("Masukkan kata kunci judul: ");
                    String keyword = input.nextLine();
                    library.searchBook(keyword);
                    break;
                case 4:
                    System.out.print("Masukkan judul buku yang akan dihapus: ");
                    String delTitle = input.nextLine();
                    library.deleteBook(delTitle);
                    break;
                case 5:
                    System.out.println("👋 Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("⚠️ Pilihan tidak valid.");
            }
        } while (choice != 5);
    }
}
