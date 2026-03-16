import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.01 * masaKerja * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth(), 1).plusMonths(1);
    }

    @Override
    public void printInfo() {

        Period masaKerja = hitungMasaKerja();

        super.printInfo();
        System.out.println("Jabatan        : Tendik");
        System.out.println("Bidang         : " + bidang);
        System.out.println("Masa Kerja     : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun: " + hitungTanggalPensiun());
        System.out.println("Tunjangan      : Rp " + hitungTunjangan());
    }
}