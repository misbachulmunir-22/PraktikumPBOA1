import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    /***********ATRIBUT************/
    private String npwp;
    private static int counterPengusaha = 0;

    /***********METHOD************/
    //Konstruktor untuk membuat Pengusaha dengan parameter nama, tanggalmulaikerja, alamat, pendapatan dan npwp
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
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
    // Mengembalikan npwp
    public String getNPWP(){
        return npwp;
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
    // Mengembalikan jumlah Pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Menghitung masa kerja dengan mengambil method dari parent manusia dan ditambahkan dengan rumus tertentu
    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 3;
    }
    
    // Menghitung pajak dengan memanfaatkan interface dari class pajak dan ditambahkan dengan rumus tertentu
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    // Mencetak info dari Pengusaha dengan mengambil method dari parent manusia dan ditambahkan info lainnya
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("\n");
    }
}