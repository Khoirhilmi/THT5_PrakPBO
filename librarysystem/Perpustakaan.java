package librarysystem;
import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;

    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tampilkanBuku() {
        for (Buku buku : koleksiBuku) {
            System.out.println("Judul: " + buku.getJudul() + ", Penulis: " + buku.getPenulis() + 
            ", Tahun: " + buku.getTahunTerbit() + ", Dipinjam: " + buku.isStatusDipinjam());
        }
    }
}
