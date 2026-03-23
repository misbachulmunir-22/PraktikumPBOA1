import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    /***********ATRIBUT************/
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;

    /***********METHOD************/
    //Konstruktor untuk membuat manusia dengan parameter nama, tanggalmulaikerja, alamat dan pendapatan
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    //Konstruktor untuk membuat manusia dengan parameter nama, tanggalmulaikerja dan pendapatan
    public Manusia(String nama, LocalDate tglMulaiKerja, double pendapatan) {
        this(nama, tglMulaiKerja, "", pendapatan);
    }
    // Mengembalikan nama
    public String getNama(){
        return nama;
    }
    // Mengembalikan tanggal mulai kerja
    public LocalDate getTglMulaiKerja(){
        return tglMulaiKerja;
    }
    // Mengembalikan alamat
    public String getAlamat(){
        return alamat;
    }
    // Mengembalikan nilai Pendapatan
    public double getPendapatan(){
        return pendapatan;
    }
    // Mengeset Nama dengan nama baru
    public void setNama(String nama) {
        this.nama = nama;
    }
    // Mengeset Alamat dengan alamat baru
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    // Mengeset Pendapatan dengan nilai baru
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    // Mengembalikan jumlah manusia
    public static int getCounterMns() {
        return counterMns;
    }
    // Menghitung masa kerja dari awal masuk sampai sekarang
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears();
    }
    // Mencetak info manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}