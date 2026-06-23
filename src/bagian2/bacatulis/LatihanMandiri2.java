package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        File fileHari = new File("hari.txt");

        System.out.println("=== SOAL 1: Menulis & Membaca 5 Nama Hari ===");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileHari))) {
            writer.write("Senin\n");
            writer.write("Selasa\n");
            writer.write("Rabu\n");
            writer.write("Kamis\n");
            writer.write("Jumat\n");
            System.out.println("-> Berhasil menulis 5 hari pertama ke hari.txt.");
        } catch (IOException e) {
            System.out.println("Gagal menulis berkas: " + e.getMessage());
        }

        System.out.println("--- Isi berkas saat ini ---");
        bacaDanTampilkanFile(fileHari);
        System.out.println();


        System.out.println("=== SOAL 2: Menambahkan (Append) 2 Nama Hari ===");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileHari, true))) {
            writer.write("Sabtu\n");
            writer.write("Minggu\n");
            System.out.println("-> Berhasil menambahkan 2 hari lagi.");
        } catch (IOException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
        }

        System.out.println("--- Isi berkas setelah di-append ---");
        bacaDanTampilkanFile(fileHari);
        System.out.println();


        System.out.println("=== SOAL 3: Menghitung Jumlah Baris ===");
        int jumlahBaris = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileHari))) {
            while (reader.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Jumlah total baris di dalam berkas 'hari.txt' = " + jumlahBaris + " baris.");
        } catch (IOException e) {
            System.out.println("Gagal membaca atau menghitung baris: " + e.getMessage());
        }
    }

    private static void bacaDanTampilkanFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca berkas: " + e.getMessage());
        }
    }
}