public class Kendaraan {
    
    /**************Atribut**************/
    private String noPlat;
    private String jenis;
    
    /**************Method**************/
    
    //konstruktor untuk membuat dosen tanpa parameter
    public Kendaraan(){
        
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void printKendaraan(){
        System.out.println("No Plat: " + noPlat);
        System.out.println("Jenis: " + jenis);
    }

}//end class Kendaraan
