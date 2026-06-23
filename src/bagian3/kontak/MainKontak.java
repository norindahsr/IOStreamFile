package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        
        System.out.println("=== Menampilkan Kontak Awal ===");
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        System.out.println("=== Menguji Pencarian Kontak ===");
        buku.cariKontak("Budi");
        buku.cariKontak("Dedi");
        System.out.println();

        System.out.println("=== Menguji Penghapusan Kontak ===");
        buku.hapusKontak("Budi");
        System.out.println();

        System.out.println("=== Memuat Ulang Dari Berkas ===");
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}