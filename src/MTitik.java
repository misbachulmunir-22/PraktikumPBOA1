/* Nama File    : MTitik.java
 * Deskripsi    : berisi aplikasi method dalam class Titik
 * Pembuat      : Misbachul Munir
 * Tanggal      : 19 Februari 2025
 */
public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik();
        Titik T2 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();
        T1.getKuadran();
        Titik a = T2.getRefleksiX();
        Titik b = T2.getRefleksiY();
        System.out.println("Titik berada di kuadran = " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));
        System.out.println("Refleksi X = (" + a.getAbsis() + ", " + a.getOrdinat() + ")");
        System.out.println("Refleksi Y = (" + b.getAbsis() + ", " + b.getOrdinat() + ")");
    }
}
