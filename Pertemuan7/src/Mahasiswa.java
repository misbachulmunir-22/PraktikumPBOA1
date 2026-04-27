public class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    // c. konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // d. konstruktor dengan 3 parameter
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }
    
    // e. konstruktor cloning
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // overloading
    public void setProgramStudi(){
        this.programStudi = "Kosong";
    }
    public void setProgramStudi(String programStudi){
        this.programStudi = programStudi;
    }
    public void setProgramStudi(Mahasiswa m){
        this.programStudi = m.programStudi;
    }
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getProgramStudi(){
        return programStudi;
    }

    public void tampilData(){
        System.out.println("NIM               : " + nim);
        System.out.println("Nama              : " + nama);
        System.out.println("Program Studi     : " + programStudi);
    }
}