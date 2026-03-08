public class MataKuliah {
    
    /**************Atribut**************/
    private String idMatKul;
    private String nama;
    private int sks;
    
    /**************Method**************/
    
    //konstruktor untuk membuat dosen tanpa parameter
    public MataKuliah(){
        
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatKul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSKS(){
        return sks;
    }

    public void setIDMatkul(String idMatkul){
        this.idMatKul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }

    public void printMatKul(){
        System.out.println("ID Matkul: " + idMatKul);
        System.out.println("Nama: " + nama);
        System.out.println("sks: " + sks);
    }

}//end class Dosen
