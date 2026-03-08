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
    static int counterTitik = 0;
    
    /***********METHOD************/
    // Konstruktor untuk membuat titik (0,0)


    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
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

    public int getKuadran(){
        if (this.absis > 0){
            if (this.ordinat > 0){
                return 1;
            }
            else{
                return 4;
            }
        }
        else{
            if (this.ordinat > 0){
                return 2;
            }
            else{
                return 3;
            }
        }
    }

    public double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    public double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void refleksiX(){
        this.ordinat = this.ordinat * -1;
    }
    
    public void refleksiY(){
        this.absis = this.absis * -1;
    }

    public Titik getRefleksiX() {
        Titik T = new Titik();
        T.setAbsis(this.absis);
        T.setOrdinat(this.ordinat * -1);
        return T;
    }
    
    public Titik getRefleksiY() {
        Titik T = new Titik();
        T.setAbsis(this.absis * -1);
        T.setOrdinat(this.ordinat);
        return T;
    }


}//end class Titik
