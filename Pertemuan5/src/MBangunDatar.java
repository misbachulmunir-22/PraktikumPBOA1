public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi();
        Persegi P2 = new Persegi(5,"Merah","Kuning");
        BangunDatar L1 = new Lingkaran(7,"Hijau","Ungu");
        Lingkaran L2 = new Lingkaran(14,"Kuning","Hijau");
        Persegi1.printInfo();
        Lingkaran1.printInfo();
        // P1.printInfo();
        P2.printInfo();
        L1.printInfo();
        L2.printInfo();

        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi : " + Persegi1.getLuas());
        Persegi1.zoomOut();
        System.out.println("Zoom Out Persegi: " + Persegi1.getSisi());
        Persegi1.zoomIn();
        System.out.println("Zoom In Persegi: " + Persegi1.getSisi());
        Lingkaran1.zoomOut();
        System.out.println("Zoom Out Lingkaran: " + Lingkaran1.getJari());
        Lingkaran1.zoomIn();
        System.out.println("Zoom In Lingkaran: " + Lingkaran1.getJari());

        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());
    }
}