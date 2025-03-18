import java.util.Scanner;

public class thtpbo3{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID: ");
        int karyawanID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan nama: ");
        String karyawanNama = scanner.nextLine();
        System.out.print("Shift kerja: ");
        String jadwalKerja = scanner.nextLine();
        System.out.print("Total jam kerja dalam seminggu: ");
        double totalJam = scanner.nextDouble();
        System.out.print("Jumlah hari absen: ");
        int jumlahAbsen = scanner.nextInt();

        if (totalJam < 0 || totalJam > 168 || jumlahAbsen < 0) {
            System.out.println("Error: Input tidak valid");
            return;
        }

        double upahPerJam;
        switch (jadwalKerja) {
            case "pagi":
                upahPerJam = 60000;
                break;
            case "siang":
                upahPerJam = 65000;
                break;
            case "malam":
                upahPerJam = 70000;
                break;
            default:
                System.out.println("Error: Shift kerja tidak valid");
                return;
        }

        double totalGaji = totalJam * upahPerJam;
        if (totalJam > 40) {
            double jamTambahan = totalJam - 40;
            double upahLembur = upahPerJam * 1.5;
            totalGaji += jamTambahan * upahLembur;
        } else if (totalJam < 30) {
            totalGaji *= 0.9;
        }

        double potongan = jumlahAbsen * 100000;
        totalGaji -= potongan;

        System.out.println("\n===== Laporan Gaji Karyawan =====");
        System.out.println("ID Karyawan       : " + karyawanID);
        System.out.println("Nama Karyawan     : " + karyawanNama);
        System.out.println("Shift Kerja       : " + jadwalKerja);
        System.out.println("Total Jam Kerja   : " + totalJam);
        System.out.println("Jumlah Hari Absen : " + jumlahAbsen);
        System.out.println("Total Gaji        : Rp" + totalGaji);

        scanner.close();
    }
}
