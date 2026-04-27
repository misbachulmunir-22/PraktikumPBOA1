/**
 * File     : Asersi2.java
 * Deskripsi: Program untuk demo asersi uang akan menolak input jari-jari lingkaran yang bernilai nol
 */
import java.util.PrimitiveIterator;

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this. jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* JAWABAN DARI PERTANYAAN DALAM MODUL
secara konsep terdapat kesalahan dalam penggunaan asersi2 ini.
Asersi digunakan untuk memastikan kondisi yang diyakini selalu benar dalam program, biasanya untuk keperluan debugging, sedangkan dalam konsep asersi2 ini digunakan untuk memvalidasi input dari pengguna.
Jika nilai jari-jari lingkaran berasal dari input user, maka penggunaan assert menjadi kurang tepat, karena input tersebut bisa saja valid.
Validasi seperti ini seharusnya ditangani menggunakan mekanisme eksepsi, bukan asersi.
*/
