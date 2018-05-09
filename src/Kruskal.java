import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kruskal {


    final int anzahlKnoten = 7;

    Integer[] a = new Integer[anzahlKnoten];
    Integer[] m = new Integer[anzahlKnoten];
    Integer[] z = new Integer[anzahlKnoten];

    ArrayList<Kanten> q = new ArrayList<>();


    public static void main(String[] args){
        Kruskal kruskal = new Kruskal();
    }

    public Kruskal(){
        q.add(new Kanten(0, 5, 5));
        q.add(new Kanten(0, 1, 8));
        q.add(new Kanten(1, 5, 2));
        q.add(new Kanten(1, 6, 3));
        q.add(new Kanten(5, 6, 6));
        q.add(new Kanten(4, 5, 1));
        q.add(new Kanten(4, 6, 3));
        q.add(new Kanten(3, 4, 4));
        q.add(new Kanten(3, 6, 5));
        q.add(new Kanten(2, 6, 2));
        q.add(new Kanten(1, 2, 3));
        q.add(new Kanten(2, 3, 4));
        Collections.sort(q);
        ArrayList<Kanten> fertigerBaum = generateBaum(q);
        output(fertigerBaum);
    }

    public ArrayList<Kanten> generateBaum(ArrayList<Kanten> q){
        int min, max;
        ArrayList<Kanten> baum = new ArrayList<Kanten>();
        for(int i = 0; i < anzahlKnoten; i++){
            a[i] = 1;
            m[i] = i;
            z[i] = i;
        }

        do{
            Kanten k = q.remove(0);
            int i = k.getK1();
            int j = k.getK2();
            if(z[i] != z[j]){
                baum.add(k);
                if(a[z[i]] < a[z[j]]){
                    min = i;
                    max = j;
                } else{
                    max = i;
                    min = j;
                }
                a[z[max]] = a[z[max]] + a[z[min]];
                int x = min;
                do{
                    z[x] = z[max];
                    x = m[x];
                } while(x != min);
                int temp = m[i];
                m[i] = m[j];
                m[j] = temp;
            }
        }while(baum.size() < anzahlKnoten-1);
        return baum;
    }
    public void output(ArrayList<Kanten> e){
        for(Kanten k : e){
            System.out.println(k.getK1() + " - " + k.getWert() + " - " + k.getK2());
        }
    }





}

