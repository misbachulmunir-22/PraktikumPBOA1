public class MMahasiswa {
    public static void main(String[] args) {
        //Mencoba semua varian setProgramStudi
        Mahasiswa m1 = new Mahasiswa("240001","Andi","Informatika"); 
        Mahasiswa m2 = new Mahasiswa("240001","Budi","Sistem Informasi"); 
        Mahasiswa m3 = new Mahasiswa("240001","Citra","Teknik Komputer"); 

        System.out.println("Data awal");
        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        System.out.println("Set program studi tanpa parameter:");
        m1.setProgramStudi();
        m1.tampilData();
        
        System.out.println("Set program studi dengan string:");
        m2.setProgramStudi("Teknologi Informasi");
        m2.tampilData();

        System.out.println("Set program studi dengan dengan objek Mahasiswa:");
        m3.setProgramStudi(m3);
        m3.tampilData();
        
        // c. konstruktor default
        System.out.println("Objek default");
        Mahasiswa mDefault = new Mahasiswa();
        mDefault.tampilData(); 
        
        // d. konstruktor 3 parameter
        System.out.println("Objek 3 parameter");
        Mahasiswa mParam = new Mahasiswa("240004","Dina","Ilmu Komputer");
        mParam.tampilData(); 
        
        // e. konstruktor cloning
        System.out.println("Objek cloning");
        Mahasiswa mClone = new Mahasiswa(mParam);
        mClone.tampilData(); 
    }
}
