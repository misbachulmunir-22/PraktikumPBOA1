/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi aplikasi method dalam class Mahasiswa
 * Pembuat      : Misbachul Munir
 * Tanggal      : 2 Maret 2025
 */
public class MMataKuliah {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO","Pemograman Berorientasi Objek",3);
        MataKuliah MBD = new MataKuliah("MBD","Manajemen Basis Data",3);
        PBO.printMatKul();
        MBD.printMatKul();
    }
}
