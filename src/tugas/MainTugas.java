package tugas;

// Nama : Nor Indah Sari
// NPM  : 2410010427

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
            "Makanan",
            "Minuman",
            "Alat Tulis"
        };

        System.out.println("=== KATEGORI BARANG ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        // Membuat gudang utama
        Gudang gudang = new Gudang("barang.txt");

        // Menambah 5 barang sesuai studi kasus
        gudang.tambahBarang(new Barang("Pensil", 3000, 20));
        gudang.tambahBarang(new Barang("Buku", 12000, 15));
        gudang.tambahBarang(new Barang("Penghapus", 2000, 10));
        gudang.tambahBarang(new Barang("Air Mineral", 5000, 25));
        gudang.tambahBarang(new Barang("Roti", 8000, 12));

        // Menyimpan seluruh data barang awal ke berkas teks
        gudang.simpanKeBerkas();
        System.out.println();

        // Membuat objek Gudang baru yang kosong untuk membuktikan data berhasil di-load dari file
        System.out.println("=== Memuat Ulang Data pada Gudang Baru ===");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        
        // Menampilkan data hasil muat ulang
        gudangBaru.tampilkanSemua();
        
        // Menampilkan total nilai persediaan aset (Harga x Stok)
        System.out.println();
        System.out.println("Total Nilai Persediaan Aset: Rp" + gudangBaru.totalNilai());
    }
}