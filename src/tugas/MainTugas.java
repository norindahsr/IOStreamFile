package tugas;

// Nama : Nor Indah Sari
// NPM  : 2410010427

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori (Minimal 3) [cite: 341]
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

        // Membuat objek gudang pertama [cite: 339]
        Gudang gudang = new Gudang("barang.txt");

        // Menambah minimal 5 objek Barang [cite: 339]
        gudang.tambahBarang(new Barang("Pensil", 3000, 20));
        gudang.tambahBarang(new Barang("Buku", 12000, 15));
        gudang.tambahBarang(new Barang("Penghapus", 2000, 10));
        gudang.tambahBarang(new Barang("Air Mineral", 5000, 25));
        gudang.tambahBarang(new Barang("Roti", 8000, 12));

        // Menyimpan seluruh data barang awal ke berkas teks [cite: 342]
        gudang.simpanKeBerkas();
        System.out.println();

        // Membuat objek Gudang baru yang kosong untuk membuktikan data tersimpan [cite: 343]
        System.out.println("=== Memuat Ulang Data pada Gudang Baru ===");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        
        // Menampilkan data hasil muat ulang dan menghitung total nilai persediaan [cite: 343]
        gudangBaru.tampilkanSemua();
        System.out.println("Total Nilai Persediaan : Rp" + gudangBaru.totalNilai());
    }
}