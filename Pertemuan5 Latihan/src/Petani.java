import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    /***********ATRIBUT************/
    private String asalKota;
    private static int counterPetani = 0;

    /***********METHOD************/
    //Konstruktor untuk membuat Petani dengan parameter nama, tanggalmulaikerja, alamat, pendapatan dan asal kota
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
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
    // Mengembalikan kota asal
    public String getAsalKota(){
        return asalKota;
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
    // Mengeset kota asal dengan kota yang baru
    public void setAsalKota(String asalKota){
        this.asalKota = asalKota;
    }
    // Mengembalikan jumlah Petani
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Menghitung masa kerja dengan mengambil method dari parent manusia dan ditambahkan dengan rumus tertentu
    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 0;
    }

    // Menghitung pajak dengan memanfaatkan interface dari class pajak dan ditambahkan dengan rumus tertentu
    @Override
    public double hitungPajak() {
        return 0;
    }

    // Mencetak info dari Pengusaha dengan mengambil method dari parent manusia dan ditambahkan info lainnya
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
        System.out.println("\n");
    }
}