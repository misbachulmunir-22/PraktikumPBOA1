public class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data(){
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public T getIsi(int posisi){
        if (posisi >= 1 && posisi <= banyak){
            return ruang[posisi-1];
        }else{
            return null;
        }
    }

    public void setIsi(int posisi, T isiData){
        if(posisi >= 1 && posisi <= 100){
            ruang[posisi-1] = isiData;
            if(posisi > banyak){
                banyak = posisi;
            }
        }else{
            System.out.println("Posisi tidak valid!");
        }
    }

    public int getSize(){
        return banyak;
    }
}