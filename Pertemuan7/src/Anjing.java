public class Anjing extends Anabul{
    public Anjing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(nama + " bergerak melata.");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi guk-guk.");
    }
}