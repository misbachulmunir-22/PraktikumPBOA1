// kelas bantuan agar nilai objek bisa ditukar referansinya
class Ref<T> {
    public T val;
    public Ref(T val) { this.val = val;}
}

public class OperatorGenerik{

    //Prosedur generik Tukar untuk menukar dua parameter generik [cita: 13]
    public static<T> void Tukar(Ref<T> a, Ref<T> b) {
        T temp = a.val;
    a.val = b.val;
    b.val = temp;
    }

    //Mengguanakan Bounded Type aParameter <T extends Kucing>
    public static <T extends Kucing, U extends Kucing> double Bobot2(T a, U b){
        // Mengembalikan jumalh boboy keduanya [cite: 17]
        return a.getBobot() + b.getBobot();
    }
}
