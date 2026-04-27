public class Dosen extends Civitasakademika {
    private String nip;

    public Dosen(String nama,String nip){
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor(){
        return nip;
    }
}
