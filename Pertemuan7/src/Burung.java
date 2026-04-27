public class Burung extends Anabul{
    public Burung(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(nama + " bergerak terbang.");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi cuit.");
    }
}