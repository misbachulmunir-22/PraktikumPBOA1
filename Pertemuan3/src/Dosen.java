public class Dosen {
    
    /**************Atribut**************/
    private String nip;
    private String nama;
    private String prodi;
    
    /**************Method**************/
    
    //konstruktor untuk membuat dosen tanpa parameter
    public Dosen(){
        
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void printDosen(){
        System.out.println("Nip: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

}//end class Dosen
