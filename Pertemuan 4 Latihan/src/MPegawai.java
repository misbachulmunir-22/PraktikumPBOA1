import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {

        DosenTetap dt = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika"
        );

        System.out.println("DATA DOSEN TETAP");
        dt.printInfo();
        
        System.out.println();
        
        DosenTamu dtamu = new DosenTamu(
            "9876543212",
            "87654321",
            "Bagas",
            LocalDate.of(1998,6,7),
            LocalDate.of(2018,1,1),
            4000000,
            "Fakultas Sains dan Matematika",
            LocalDate.of(2026,10,10)
            );
            
        System.out.println("DATA DOSEN TAMU");
        dtamu.printInfo();
        System.out.println();

        Tendik t = new Tendik(
            "11223344",
            "Budi",
            LocalDate.of(1992,3,10),
            LocalDate.of(2018,2,1),
            3500000,
            "Akademik"
            );
            
            System.out.println("DATA TENDIK");
            t.printInfo();
    }
}