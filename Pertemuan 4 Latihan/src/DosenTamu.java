import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate akhirKontrak;

    public DosenTamu(String nip, String nidk, String nama,
                     LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas,
                     LocalDate akhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public Period sisaKontrak() {
        return Period.between(LocalDate.now(), akhirKontrak);
    }

    @Override
    public void printInfo() {

        super.printInfo();

        Period sisa = sisaKontrak();

        System.out.println("NIDK           : " + nidk);
        System.out.println("Jabatan        : Dosen Tamu");
        System.out.println("Fakultas       : " + fakultas);
        System.out.println("Sisa Kontrak   : " + sisa.getYears() + " tahun " + sisa.getMonths() + " bulan");
        System.out.println("Tunjangan      : Rp " + hitungTunjangan());
    }
}