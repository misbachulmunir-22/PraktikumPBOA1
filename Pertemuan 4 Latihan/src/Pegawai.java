import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public void printInfo() {
        System.out.println("NIP            : " + nip);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("TMT            : " + tmt);
        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
    }
}