/**
 * File     : AngkaSial.java
 * Deskripsi: Program penggunaan exception buatan sendiri Pneganalan klausa 'throw' dan 'throws'
 */

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}


/* JAWABAN DARI PERTANYAAN DALAM MODUL
Ketika terjadi eksepsi, baris ke-12 tidak akan dieksekusi dan baris ke-21 tetap akan dieksekusi.
Alasan kenapa baris ke-12 tidak dieksekusi adalah karena program langsung menghentikan alur ketika sudah masuk di kondisi if yang berisi perintah throw yang melempar eksepsi.
Alasan kenapa baris ke-21 tetap dieksekusi adalah karena telah selesai menangani eksepsi, sehingga program dapat melanjutkan eksekusi seperti biasa.
*/