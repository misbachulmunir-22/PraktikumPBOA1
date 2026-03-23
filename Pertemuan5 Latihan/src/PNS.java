import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    /***********ATRIBUT************/
    private String nip;
    private static int counterPNS = 0;

    /***********METHOD************/
    //Konstruktor untuk membuat manusia dengan parameter nama, tanggalmulaikerja, alamat, pendapatan dan nip
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    //Konstruktor untuk membuat PNS dengan parameter nama, tanggalmulaikerja dan pendapatan
    public PNS(String nama, LocalDate tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
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
    // Mengembalikan nip
    public String getNIP(){
        return nip;
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
    // Mengembalikan jumlah PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Menghitung masa kerja dengan mengambil method dari parent manusia dan ditambahkan dengan rumus tertentu
    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 1;
    }

    // Menghitung pajak dengan memanfaatkan interface dari class pajak dan ditambahkan dengan rumus tertentu
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // Mencetak info dari Pengusaha dengan mengambil method dari parent manusia dan ditambahkan info lainnya
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("\n");
    }
}