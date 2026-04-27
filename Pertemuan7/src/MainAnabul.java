public class MainAnabul{
    public static void main(String[] args){
        Anabul[] daftar= {
            new Kucing("Mimi"),
            new Anjing("Doggy"),
            new Burung("Cici")
        };

        for (Anabul a : daftar){
            a.bersuara();
            a.gerak();
            System.out.println();
        }
    }
}