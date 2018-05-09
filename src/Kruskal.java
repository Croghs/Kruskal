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
        q.add(new Kanten(1, 6, 5));
        q.add(new Kanten(1, 2, 8));
        q.add(new Kanten(2, 6, 2));
        q.add(new Kanten(2, 7, 3));
        q.add(new Kanten(6, 7, 6));
        q.add(new Kanten(5, 6, 1));
        q.add(new Kanten(5, 7, 3));
        q.add(new Kanten(4, 5, 4));
        q.add(new Kanten(4, 7, 5));
        q.add(new Kanten(3, 7, 2));
        q.add(new Kanten(2, 3, 3));
        q.add(new Kanten(3, 4, 4));
        Collections.sort(q);
        System.out.println("Hentai>all");
    }
}

