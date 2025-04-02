package librarysystem;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean statusDipinjam;
    private static int jumlahBukuTersedia;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
        jumlahBukuTersedia++;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getTahunTerbit() { return tahunTerbit; }
    public boolean isStatusDipinjam() { return statusDipinjam; }
    
    public void pinjamBuku() {
        if (!statusDipinjam) {
            statusDipinjam = true;
            jumlahBukuTersedia--;
        }
    }

    public void kembalikanBuku() {
        if (statusDipinjam) {
            statusDipinjam = false;
            jumlahBukuTersedia++;
        }
    }
    
    public static int getJumlahBukuTersedia() {
        return jumlahBukuTersedia;
    }
}
