public class MainTeman{
    public static void main(String[] args){
        Teman t = new Teman();
        t.addNama("Budi");
        t.addNama("Siti");
        t.addNama("Andi");

        System.out.println("Jumlah teman : " + t.getNbelm());
        System.out.println("\n Nama pertama : " + t.getNama(1));
        t.setNama(1,"Felis");
        System.out.println("\nKoleksi terbaru : ");
        t.showTeman();
        
        t.delNama("Felis");
        System.out.println("\nKoleksi Terbaru");
        t.showTeman();
        
        System.out.println(t.isMember("Budi"));

        t.gantiNama("Andi","wowo");
        System.out.println("\nKoleksi Terbaru");
        t.showTeman();
        
        System.out.println("\nBanyak nama dari list Lnama: " + t.countNama("wowo"));

    }
}