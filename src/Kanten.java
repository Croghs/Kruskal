public class Kanten implements Comparable<Kanten>{
    public int k1, k2, wert;

    public Kanten(int k1, int k2, int wert){
        this.k1 = k1;
        this.k2 = k2;
        this.wert = wert;
    }

    @Override
    public int compareTo(Kanten o) {
        Kanten e1 = (Kanten)o;
        if(e1.wert==this.wert)
            return 0;
        return e1.wert < this.wert ? 1 : -1;
    }

    public int getK1() {
        return k1;
    }

    public void setK1(int k1) {
        this.k1 = k1;
    }

    public int getK2() {
        return k2;
    }

    public void setK2(int k2) {
        this.k2 = k2;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }
}
