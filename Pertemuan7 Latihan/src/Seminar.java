public class Seminar{
    private Civitasakademika[] peserta;
    private int banyakPeserta;

    public Seminar(){
        peserta = new Civitasakademika[100];
        banyakPeserta = 0;
    }

    public void registrasi(Civitasakademika c){
        if (banyakPeserta < 100){
            peserta[banyakPeserta] = c;
            banyakPeserta++;
        } else{
            System.out.println("Peserta sudah penuh!");
        }
    }

    public int countPeserta(){
        return banyakPeserta;
    }

    public void tampilPeserta(){
        for(int i = 0;i<banyakPeserta;i++){
            System.out.println(peserta[i].getNomor() + " - " + peserta[i].getNama());
        }
    }

    public int countMahasiswa(){
        int count = 0;
        for(int i = 0;i<banyakPeserta;i++){
            if(peserta[i] instanceof Mahasiswa){
                count++;
            }
        }
        return count;
    }
}
