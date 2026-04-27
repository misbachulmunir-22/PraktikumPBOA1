/**
 * File     : AngkaSialexception.java
 * Deskripsi: Eksepsi buatan sendiri, menolak masuk angka 13!
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}