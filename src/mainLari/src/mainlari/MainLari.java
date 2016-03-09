package mainlari;

import java.util.Scanner;

public class MainLari {

    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        Scanner ini = new Scanner(System.in);
       
        System.out.print("panjang lapangan : ");
        int panjang = ini.nextInt();
        System.out.print("lebar lapangan : ");
        int lebar = ini.nextInt();
        lapangan lapangan1 = new lapangan(panjang, lebar);

        mahasiswa m[] = new mahasiswa[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("nim : ");
            String nim = ins.nextLine();
            System.out.print("nama : ");
            String nama = ins.nextLine();
            m[i] = new mahasiswa(nama, nim);
            System.out.print("jumlah putaran : ");
            int putaran = ini.nextInt();
            System.out.print("waktu : ");
            int waktu = ini.nextInt();
            m[i].setlari(putaran, waktu);
            m[i].jumlari(lapangan1.getkeliling());

        }
                m[0].display(m[1].getwaktu(), m[2].getwaktu(), m[1].getnama(), m[2].getnama(),
                m[1].jumlari(lapangan1.getkeliling()), m[2].jumlari(lapangan1.getkeliling()));

    }

}
