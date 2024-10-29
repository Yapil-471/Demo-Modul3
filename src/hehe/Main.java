package hehe;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /**
         * Metode utama untuk menjalankan program.
         *
         * @param args Argumen baris perintah
         */
        PinjamanOnline pinjaman = new PinjamanOnline("Yapil", 5000000, LocalDate.of(2023, 10, 1), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 5));

        pinjaman.tampilkanInfoPinjaman();

        pinjaman.hitungBungaKeterlambatan();

        pinjaman.tampilkanInfoPinjaman();
    }
}
