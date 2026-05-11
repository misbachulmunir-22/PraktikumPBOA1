import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // getNbelme
    public  int getNbelm() {
        return nbelm;
    }

    //getNama
    public String getNama(int indeks){
        if(indeks >= 0 && indeks < Lnama.size()){
            return Lnama.get(indeks);
        }
        return null;
    }

    //setNama
    public void setNama(int indeks, String nama){
        if (indeks >= 0 && indeks < Lnama.size()){
            Lnama.set(indeks,nama);
        }
    }

    // addNama(nama)
    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm++;
    }

    // delNama(nama)
    public void delNama(String nama){
        Lnama.remove(nama);
        this.nbelm--;
    }

    //showTeman
    public void showTeman(){
        System.out.println("Daftar teman :");
        for (String n:Lnama){
            System.out.println("-" + n);
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String member){
        int N = Lnama.indexOf(nama);
        Lnama.set(N,member);
    }

    public int countNama(String nama){
        int count = 0;
        for (int i = 0; i < Lnama.size(); i++){
            if (Lnama.get(i).equalsIgnoreCase(nama)){
                count++;
            }
        }
        return count;
    }
}


// yang dihapus, anggota yang paling depan (untuk tugas minggu depan)