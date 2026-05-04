public class MAnabul {
    public static void main(String[] args) {
        // Anabul[] daftar= {
        // new Kucing("Mimi"),
        // new Anjing("Doggy"),
        // new Burung("Cici")
        // };
        // for (Anabul a : daftar){
        // a.bersuara();
        // a.gerak();
        // System.out.println();
        // }
        System.out.println("\nAPLIKASI TUKAR & BOBOT2");
        // Aplikasi prosedur generik Tukar untuk sesama integer
        Ref<Integer> aInt = new Ref<>(3);
        Ref<Integer> bInt = new Ref<>(6);
        System.out.println("Sebelum Tukar: a=" + aInt.val + ", b=" + bInt.val);
        OperatorGenerik.Tukar(aInt, bInt);
        System.out.println("Sesudah Tukar: a=" + aInt.val + ", b= " + bInt.val);

        // Aplikasi prosedur generik Tukar untuk sesama string
        Ref<String> aStr = new Ref<>("Halo");
        Ref<String> bStr = new Ref<>("Dunia");
        System.out.println("Sebelum Tukar: a=" + aStr.val + ", b=" + bStr.val);
        OperatorGenerik.Tukar(aStr, bStr);
        System.out.println("Sesudah Tukar: a=" + aStr.val + ", b= " + bStr.val);

        // Aplikasi prosedur generik Tukar untuk keluarga Anabul
        Ref<Anabul> aAnabul = new Ref<>(new Anjing("Buster"));
        Ref<Anabul> bAnabul = new Ref<>(new Kucing("Milo", 3.0));
        System.out.println("Sebelum Tukar: a=" + aAnabul.val.getClass().getSimpleName() + ", b="
                + bAnabul.val.getClass().getSimpleName());
        OperatorGenerik.Tukar(aAnabul, bAnabul);
        System.out.println("Sesudah Tukar: a=" + aAnabul.val.getClass().getSimpleName() + ", b= "
                + bAnabul.val.getClass().getSimpleName());

        // Aplikasi fungsi ggenerik Bobot2
        Anggora kucingA = new Anggora("Mimi", 5.0);
        Kembangtelon kucingB = new Kembangtelon("Belang", 4.2);
        double totalBobot = OperatorGenerik.Bobot2(kucingA, kucingB);
        System.out.println("Total bobot 2 kucing keturunan: " + totalBobot + " kg");

        System.out.println("\nAPLIKASI LARIK GENERIK");
        // Realisasi kelas Data & aplikasi untuk keluarga obje Anabul [cite: 26, 27, 28,
        // 29]
        Data<Anabul> dataAnabul = new Data<>();
        Anabul a1 = new Kucing("Imup", 4.0);
        Anabul a2 = new Anjing("Hery");
        Anabul a3 = new Burung("Cuicui");

        dataAnabul.setIsi(1, a1);
        dataAnabul.setIsi(2, a2);
        dataAnabul.setIsi(3, a3);

        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul a = dataAnabul.getIsi(i);
            a.gerak();
            a.bersuara();

            if (a instanceof Kucing) {
                Kucing k = (Kucing) a;
                System.out.println("Bobot: " + k.getBobot());
            }
        }

        // Menampilkan jumlah data
        System.out.println("Jumlah data: " + dataAnabul.getSize());
    }
}

/* Jawaban untuk Pertanyaan yang ada di modul
Cara kerja konsep generik adalah kita membuat sebuah kelas yang tipe datanya belum ditentukan di awal (masih berupa parameter seperti <T>).
Jadi kelas tersebut bisa digunakan untuk berbagai jenis data tanpa harus membuat ulang kelas yang sama.
Nantinya, tipe data yang sebenarnya baru ditentukan saat kelas tersebut digunakan.
Misalnya pada kelas Data<T>, kita belum tahu isi datanya apa. Saat dipakai, kita bisa mengisinya dengan tipe tertentu,
misalnya Data<Anabul>, sehingga isi dari kelas generik tersebut menjadi objek-objek bertipe Anabul.
Dengan begitu, generik membuat program jadi lebih fleksibel dan bisa digunakan ulang tanpa perlu membuat banyak kelas dengan fungsi yang sama.*/