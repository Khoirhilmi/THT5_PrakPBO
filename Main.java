import librarysystem.*;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku("Java Programming", "James Gosling", 1995);
        Buku buku2 = new Buku("Data Structures", "Robert Lafore", 2002);
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.tampilkanBuku();
        
        User user1 = new User("Alice", "U001");
        user1.pinjamBuku(buku1);
        user1.kembalikanBuku(buku1);
        
        System.out.println("Daftar Buku setelah transaksi:");
        perpustakaan.tampilkanBuku();
    }
}
