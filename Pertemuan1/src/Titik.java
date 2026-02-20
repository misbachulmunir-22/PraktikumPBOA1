/*
 * File        : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Misbachul Munir
 * Tanggal     : 19 Februari 2026
 */

public class Titik {
    /***********ATRIBUT************/
    double absis;
    double ordinat;
    
    /***********METHOD************/
    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai Ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absisi titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Menggeser ordinat titik dengan niali baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }
    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
} //end class Titik
