public class Main{
    public static void main(String[] args){
        Datum<Anabul> dataAnabul = new Datum<>();

        Anggora anggora = new Anggora("Milo",4.2);
        Kembangtelon Kembangtelon = new Kembangtelon("Luna",3.5);
        
        dataAnabul.setIsi(anggora);
        dataAnabul.getIsi().gerak();
        dataAnabul.getIsi().bersuara();
        
        dataAnabul.setIsi(Kembangtelon);
        dataAnabul.getIsi().gerak();
        dataAnabul.getIsi().bersuara();
    }
}