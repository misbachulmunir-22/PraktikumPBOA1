/*
 * File      : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Misbachul Munir
 * Tanggal   : 18 Juni 2026
 */

public class Garis {
    /***********ATRIBUT************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;
    /***********METHOD************/
    //konstruktor garis
    public Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }
    // Mengembalikan nilai titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }
    // Mengembalikan nilai titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }
    // Mengembalikan nilai getcountergaris
    public static int getCounterGaris() {
        return counterGaris;
    }
    // Mengeset titik awal dengan nilai baru
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }
    // Mengeset titik akhir dengan nilai baru
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Mencari Panjang garis
    public double getPanjang() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    // Mencari Gradien dari garis
    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();
        return (y2 - y1) / (x2 - x1);
    }
    // Mencari nilai Titik tengah
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    // Mengecek apakah garis sejajar atau tidak
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah garis Tegak lurus atau tidak
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan garis
    public void printGaris() {
        System.out.print("Titik Awal : ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // Persamaan garis
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}