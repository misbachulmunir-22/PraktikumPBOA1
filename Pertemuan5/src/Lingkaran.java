public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran (double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
    }

    public double getJari (){
        return jari; 
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}