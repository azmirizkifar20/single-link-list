public class Siswa {
    String nama;
    int nis;
    int nilai;

    public Siswa(String nama, int nis, int nilai) {
        this.nama = nama;
        this.nis = nis;
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIS     : " + nis);
        System.out.println("Nila    : " + nilai);
        System.out.println();
    }
}