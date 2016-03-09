package mainlari;

public class lapangan {

    int panjang, lebar;

    public lapangan(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void setLapangan(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getkeliling() {
        return 2 * (panjang + lebar);
    }
}
