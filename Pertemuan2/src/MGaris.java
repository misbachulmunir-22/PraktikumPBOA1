/*
 * File      : MGaris.java
 * Deskripsi : berisi aplikasi method dalam class Garis
 * Pembuat   : Misbachul Munir
 * Tanggal   : 18 Juni 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Garis G1 = new Garis(T1, T2);
        System.out.println("====== DATA GARIS ======");
        G1.printGaris();
        System.out.println("\nPanjang Garis : " + G1.getPanjang());
        System.out.println("Gradien : " + G1.getGradien());
        System.out.print("Titik Tengah : ");
        G1.getTitikTengah().printTitik();
        System.out.println("Persamaan : " + G1.getPersamaanGaris());
        System.out.println("\nJumlah Titik : " + Titik.getCounterTitik());
        System.out.println("Jumlah Garis : " + Garis.getCounterGaris());
        Garis G2 = new Garis(
                new Titik(1, 1),
                new Titik(3, 5));
        System.out.println("\nApakah G1 sejajar dengan G2 : " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2 : " + G1.isTegakLurus(G2));
    }
}