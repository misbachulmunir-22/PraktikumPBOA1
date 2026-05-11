import java.util.*;

public class Piaraan{
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    //getNbelm
    public int getNbelm(){
        return nbelm;
    }

    // enqueueAnabul
    public void enqueueAnabul(Anabul a){
        Lanabul.add(a);
        nbelm++;
    }

    //isMember
    public boolean isMember(Anabul a){
        return Lanabul.contains(a);
    }

    //getAnabul
    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    //duqueueAnabul
    public Anabul dequeueAnabul(){
        if(!Lanabul.isEmpty()){
            nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    //showAnabul
    public void showAnabul(){
        for(Anabul a : Lanabul){
            System.out.println(a.getNama());
        }
    }

    //countKucing
    public int countKucing(){
        int count = 0;
        for(Anabul a : Lanabul){
            if (a instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    //bobotKucing
    public double bobotKucing(){
        double total = 0.0;
        for(Anabul a : Lanabul){
            if (a instanceof Kucing){
                total += ((Kucing)a).getBobot();
            }
        }
        return total;
    }

    //showJenisAnabul
    public void showJenisAnabul(){
        for(Anabul a : Lanabul){
            System.out.println(a.getNama() + "-" + a.getClass().getName());
        }
    }
}