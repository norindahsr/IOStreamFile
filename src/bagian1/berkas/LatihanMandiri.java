package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        System.out.println("=== SOAL 1: Cek File laporan.txt ===");
        // 1. Buat objek File yang menunjuk laporan.txt
        File fileLaporan = new File("laporan.txt");
        
        // Tampilkan apakah berkas tersebut ada, dan jika ada tampilkan ukurannya dalam byte
        if (fileLaporan.exists()) {
            System.out.println("Status: Berkas 'laporan.txt' ditemukan.");
            System.out.println("Ukuran file: " + fileLaporan.length() + " byte");
        } else {
            System.out.println("Status: Berkas 'laporan.txt' TIDAK ditemukan.");
            System.out.println("Catatan: Silakan buat file 'laporan.txt' manual di folder project jika ingin tes ukurannya.");
        }
        System.out.println();


        System.out.println("=== SOAL 2: Buat Folder arsip ===");
        // 2. Buat sebuah folder baru bernama arsip menggunakan method mkdir()
        File folderArsip = new File("arsip");
        
        // Tampilkan pesan berhasil atau gagal berdasarkan nilai yang dikembalikan method tersebut
        if (folderArsip.mkdir()) {
            System.out.println("Status: Berhasil membuat folder baru bernama 'arsip'.");
        } else {
            // mkdir() mengembalikan false jika folder sudah ada atau terjadi error/gagal
            if (folderArsip.exists()) {
                System.out.println("Status: Gagal membuat folder 'arsip' karena folder sudah ada.");
            } else {
                System.out.println("Status: Gagal membuat folder 'arsip'.");
            }
        }
        System.out.println();


        System.out.println("=== SOAL 3: Buat dan Hapus sementara.txt ===");
        // 3. Buat objek File sementara.txt
        File fileSementara = new File("sementara.txt");
        
        try {
            // Buat berkasnya fisik di penyimpanan lokal
            if (fileSementara.createNewFile()) {
                System.out.println("-> Berkas 'sementara.txt' sukses dibuat fisik.");
            }
            
            // Tampilkan status keberadaan berkas sebelum dihapus
            System.out.println("Status SEBELUM dihapus (exists()): " + fileSementara.exists());
            
            // Lalu hapus kembali dengan method delete()
            if (fileSementara.delete()) {
                System.out.println("-> Berkas 'sementara.txt' berhasil dihapus.");
            } else {
                System.out.println("-> Gagal menghapus berkas 'sementara.txt'.");
            }
            
            // Tampilkan status keberadaan berkas sesudah dihapus
            System.out.println("Status SESUDAH dihapus (exists()): " + fileSementara.exists());
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan sistem saat membuat file: " + e.getMessage());
        }
    }
}