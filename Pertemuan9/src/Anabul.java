public class Anabul{
    protected String nama;

    public Anabul(String nama){
        this.nama = nama;
    }

    public void gerak(){
        System.out.println(nama + " bergerak.");
    }
    public void bersuara(){
        System.out.println(nama + " bersuara.");
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}