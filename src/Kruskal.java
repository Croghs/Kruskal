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

        for(int i = 0; i < anzahlKnoten; i++){
            a[i] = 1;
            m[i] = i;
            z[i] = i;
        }

        do{

        }while()

    }




}

