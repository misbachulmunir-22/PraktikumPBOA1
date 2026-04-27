public class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim){
        super(nama);
        this.nim = nim;
    }

    @Override
    public String getNomor(){
        return nim;
    }

    public void setWali(Dosen dosen){
        this.dosenWali = dosen;
    }

    public void tampilDataMahasiswa(){
        System.out.println("NIM     : "+ nim);
        System.out.println("Nama    : "+ nama);
        if (dosenWali != null){
            System.out.println("Dosen Wali    : "+ dosenWali.getNama());
        } else{
            System.out.println("Dosen Wali    : -");
        }
        System.out.println();

    }
}
