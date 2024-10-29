package hehe;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PinjamanOnline {
    private String namaPeminjam;
    private double jumlahPinjaman;
    private double bunga;
    private LocalDate tanggalPinjam;
    private LocalDate jatuhTempo;
    private LocalDate tanggalBayar;
    /**
     * Konstruktor untuk membuat objek PinjamanOnline dengan informasi yang diberikan.
     *
     * @param namaPeminjam   Nama peminjam,
     * @param jumlahPinjaman Jumlah pinjaman
     * @param tanggalPinjam  Tanggal pinjam
     * @param jatuhTempo     Tanggal jatuh tempo
     * @param tanggalBayar   Tanggal bayar
     */

    public PinjamanOnline(String namaPeminjam, double jumlahPinjaman, LocalDate tanggalPinjam, LocalDate jatuhTempo, LocalDate tanggalBayar) {
        setNamaPeminjam(namaPeminjam);
        setJumlahPinjaman(jumlahPinjaman);
        setTanggalPinjam(tanggalPinjam);
        setJatuhTempo(jatuhTempo);
        setTanggalBayar(tanggalBayar);
        hitungBungaAwal();
    }
    /**
     * Mendapatkan nama peminjam.
     *
     * @return Nama peminjam
     */
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(double jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public LocalDate getJatuhTempo() {
        return jatuhTempo;
    }

    public void setJatuhTempo(LocalDate jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public LocalDate getTanggalBayar() {
        return tanggalBayar;
    }

    public void setTanggalBayar(LocalDate tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }

    /**
     * Menghitung bunga awal sebesar 10% dari jumlah pinjaman.
     */
    private void hitungBungaAwal() {
        bunga = getJumlahPinjaman() * 0.1;
    }
    public void hitungBungaKeterlambatan() {
        long hariTelat = ChronoUnit.DAYS.between(jatuhTempo, tanggalBayar);
        if (hariTelat > 0) {
            bunga += getJumlahPinjaman() * 0.1;
            System.out.println("Bunga bertambah 10% karena keterlambatan.");
        }
    }

    public void tampilkanInfoPinjaman() {
        System.out.println("Nama Peminjam: " + getNamaPeminjam());
        System.out.println("Jumlah Pinjaman: " + getJumlahPinjaman());
        System.out.println("Bunga: " + bunga);
        System.out.println("Tanggal Pinjam: " + getTanggalPinjam());
        System.out.println("Jatuh Tempo: " + getJatuhTempo());
        System.out.println("Tanggal Bayar: " + getTanggalBayar());
    }
    /**
     *Memindahkan class PinjamanOnline ke package hehe
     *Memindahkan method main ke class Main
     */


}

