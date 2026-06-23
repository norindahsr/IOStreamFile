package tugas;

public class MainTugas {

    public static void main(String[] args) {
        System.out.println("=== 1. Daftar Kategori Barang ===");
        String[] kategori = {"Elektronik", "Pakaian", "Makanan", "Alat Tulis"};
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println();

        System.out.println("=== 2. Membuat Gudang Utama & Menambah 5 Barang ===");
        Gudang gudangUtama = new Gudang("barang.txt");
        gudangUtama.tambahBarang(new Barang("Laptop", 12000000.0, 5));
        gudangUtama.tambahBarang(new Barang("Mouse", 150000.0, 20));
        gudangUtama.tambahBarang(new Barang("Keyboard", 350000.0, 15));
        gudangUtama.tambahBarang(new Barang("Monitor", 2500000.0, 8));
        gudangUtama.tambahBarang(new Barang("Headset", 500000.0, 12));

        gudangUtama.tampilkanSemua();
        gudangUtama.simpanKeBerkas();
        System.out.println();

        System.out.println("=== 3. Membuat Objek Gudang Baru & Memuat Data Berkas ===");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();

        System.out.println("Total Nilai Persediaan: Rp " + gudangBaru.totalNilai());
    }
}
