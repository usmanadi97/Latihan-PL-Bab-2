package mainlari;

public class mahasiswa {

    public String nim, nama;
    int putaran, waktu, jumlah;

    public mahasiswa(String n, String na) {
        nama = n;
        nim = na;
    }

    public void setlari(int putaran, int waktu) {
        this.putaran = putaran;
        this.waktu = waktu;
    }

    public int jumlari(int l) {
        jumlah = l * putaran;
        return jumlah;
    }

    public String getnama() {
        return nama;
    }

    public int getwaktu() {
        return waktu;
    }

    public void display(int a, int b, String c, String d, int g, int h) {

        
        System.out.print(nama + " ");
        System.out.println(jumlah);

        
        System.out.print(c + " ");
        System.out.println(g);

        
        System.out.print(d + " ");
        System.out.println(h);

        if (getwaktu() < a && getwaktu() < b) {
            System.out.println(nama + " tercepat");
        } else if (a < b) {
            System.out.println(c + " tercepat");
        } else {
            System.out.println(d + " tercepat");
        }

    }
}
