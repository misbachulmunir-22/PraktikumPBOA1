import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {

        PNS p1 = new PNS("Satriyo",
                LocalDate.of(2006, 4, 1),
                "Jl. Seroja",
                15000000,
                "198302032006041002");

        Pengusaha pe1 = new Pengusaha("Adhy",
                LocalDate.of(2000, 1, 1),
                "Jl.Air",
                55000000,
                "0005567732120005");

        Petani pt1 = new Petani("Nugraha",
                LocalDate.of(1977, 1, 9),
                "Jl. Bunga 9 Tembalang",
                5000000,
                "Wonogiri");

        PNS p2 = new PNS("Panji",
                LocalDate.of(2010, 4, 1),
                10000000,
                "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak PNS p2 = " + p2.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja p2 = " + p2.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("\n");
        
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
        
        System.out.println("----------Pemanggilan Tambahan----------");
        System.out.println("Nama Pengusaha = " + pe1.getNama());
        System.out.println("Tanggal mulai kerja PNS = " + p1.getTglMulaiKerja());
        System.out.println("Asal Kota Petani = " + pt1.getAsalKota());
        pe1.setPendapatan(60000000);
        System.out.println("Update Pendapatan Pengusaha = " + pe1.getPendapatan());



    }
}