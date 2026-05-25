import java.util.HashMap;
import java.util.Map;

/**
 * File: Map.java
 * Deskripsi: program yang digunakan untuk menampilkan key dan value dari sebuah Map,
    dimana key merupakan NIM dan value merupakan nama mahasiswa, menggunakan ekspresi lambda
 */
public class LambdaMap {

    public static void main(String[] args) {

        Map<String,String> mahasiswaList = new HashMap<>();

        mahasiswaList.put("NIM : 2406001 ","Nama : Adi");
        mahasiswaList.put("NIM : 2406002 ","Nama : Bambang");
        mahasiswaList.put("NIM : 2406003 ","Nama : Cici");
        mahasiswaList.put("NIM : 2406004 ","Nama : Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nim,nama) -> {System.out.print(nim);
                                            System.out.println(nama);});
    }
}