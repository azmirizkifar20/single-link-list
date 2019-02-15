import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Function<Siswa>fungsi = new Function<>();
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.println("===================================");
            System.out.println("Kuvukiland's Teacher App");
            System.out.println("1. Insert data (depan)");
            System.out.println("2. Insert data (belakang)");
            System.out.println("3. Insert data (tengah)");
            System.out.println("4. Hapus data (depan)");
            System.out.println("5. Hapus data (belakang)");
            System.out.println("6. Hapus data (tengah)");
            System.out.println("7. Hapus data (semua)");
            System.out.println("8. Tampilkan data");
            System.out.println("9. Tampilkan data (nilai tertinggi)");
            System.out.println("10. Keluar");
            System.out.println("===================================");
            System.out.print("Masukkan pilihan => "); int pilih = input.nextInt();
            System.out.println();

            if (pilih == 1) {
                System.out.print("Masukkan Nama  : "); String nama = input.next();
                System.out.print("Masukkan NIS   : "); int nis = input.nextInt();
                System.out.print("Masukkan Nilai : "); int nilai = input.nextInt();
                Siswa siswa = new Siswa(nama, nis, nilai);
                fungsi.addDepan(siswa);
                System.out.println("Insert depan berhasil!");
                System.out.println();
            }

            else if (pilih == 2) {
                if (fungsi.isEmpty()) {
                    System.out.println("Isi data terlebih dahulu!");
                    System.out.println();
                } else {
                    System.out.print("Masukkan Nama  : ");
                    String nama = input.next();
                    System.out.print("Masukkan NIS   : ");
                    int nis = input.nextInt();
                    System.out.print("Masukkan Nilai : ");
                    int nilai = input.nextInt();
                    Siswa siswa = new Siswa(nama, nis, nilai);
                    fungsi.addBelakang(siswa);
                    System.out.println("Insert belakang berhasil!");
                    System.out.println();
                }
            }

            else if (pilih == 3) {
                if (fungsi.isEmpty()) {
                    System.out.println("Isi data terlebih dahulu!");
                    System.out.println();
                } else {
                    System.out.print("Masukkan data NIS sebelumnya : ");
                    int key = input.nextInt();
                    System.out.print("Masukkan Nama  : ");
                    String nama = input.next();
                    System.out.print("Masukkan NIS   : ");
                    int nis = input.nextInt();
                    System.out.print("Masukkan Nilai : ");
                    int nilai = input.nextInt();
                    Siswa siswa = new Siswa(nama, nis, nilai);
                    fungsi.addTengah(siswa, key);
                    System.out.println();
                }
            }

            else if (pilih == 4) {
                fungsi.deleteDepan();
                System.out.println();
            }

            else if (pilih == 5) {
                fungsi.deleteBelakang();
                System.out.println();
            }

            else if (pilih == 6) {
                if (fungsi.isEmpty()) {
                    System.out.println("Isi data terlebih dahulu!");
                    System.out.println();
                } else {
                    System.out.print("Masukkan data NIS : ");
                    int key2 = input.nextInt();
                    fungsi.deleteTengah(key2);
                    System.out.println();
                }
            }

            else if (pilih == 7) {
                fungsi.deleteAll();
                System.out.println();
            }

            else if (pilih == 8) {
                fungsi.tampilkan();
            }

            else if (pilih == 9) {
                fungsi.tampilJuara();
            }

            else if (pilih == 10) {
                System.out.println("Terimakasih :)");
                jalan = false;
            }
        }
    }
}