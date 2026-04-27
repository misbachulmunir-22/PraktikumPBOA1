public class MainSeminar{
    public static void main(String[] args){
        Seminar seminar = new Seminar();

        Dosen d1 = new Dosen("Pak Agus", "D001");
        Dosen d2 = new Dosen("Bu Marni", "D002");

        Mahasiswa m1 = new Mahasiswa("Misbah", "M001");
        Mahasiswa m2 = new Mahasiswa("Munir", "M002");
        Mahasiswa m3 = new Mahasiswa("Paijo", "M003");
        Mahasiswa m4 = new Mahasiswa("Sofia", "M004");
        Mahasiswa m5 = new Mahasiswa("Anam", "M005");

        m1.setWali(d1);
        m2.setWali(d2);
        m3.setWali(d2);
        m4.setWali(d1);
        m5.setWali(d2);

        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        System.out.println("Daftar Peserta: ");
        seminar.tampilPeserta();
        System.out.println("\n Jumlah Peserta: "+ seminar.countPeserta());
        System.out.println("Jumlah Mahasiswa: "+ seminar.countMahasiswa());
        System.out.println("\nData Mahasiswa: ");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}

/*
Polimorfisme pada program ini bisa dilihat dari cara penggunaan kelas Civitasakademika sebagai tempat/wadah untuk menyimpan objek Dosen dan Mahasiswa dalam satu array. 
Meskipun tipe datanya sama, isi objeknya bisa beda-beda karena berasal dari kelas turunan yang berbeda.
Selain itu, polimorfisme juga terjadi polimorfisme inclusion pada method getNomor(). Walaupun method ini telah ada di kelas civitias akademika yang posisinya adalah parent, tapi di masing-masing anaknya hasilnya berbeda.
Kalau objeknya Dosen, maka yang ditampilkan adalah NIP, sedangkan kalau Mahasiswa, yang keluar adalah NIM.
*/
