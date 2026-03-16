public class Dosen extends Pegawai {

    protected String fakultas;

    public Dosen(String nip, String nama, java.time.LocalDate tanggalLahir,
                 java.time.LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}