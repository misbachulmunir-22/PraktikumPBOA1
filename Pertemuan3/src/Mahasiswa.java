import java.util.ArrayList;

public class Mahasiswa {

    /************** Atribut **************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /************** Method **************/

    // konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>(); // inisialisasi ArrayList kosong
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public double getJumlahSKS(){
        int jumlahSKS = 0;
        for(int i=0;i<listMatkul.size();i++){
            jumlahSKS = jumlahSKS + listMatkul.get(i).getSKS();
        }
        return jumlahSKS;
    }

    public double getJumlahMatKul(){
        return listMatkul.size();
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }


    public void printDetailMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    }
}// end class Mahasiswa
