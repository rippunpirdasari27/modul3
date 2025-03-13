import java.util.Scanner;

public class postestpbo {
    public static double hitungTotalAkhir(double totalBelanja, String member) {
        double diskonUtama;
        if (totalBelanja > 500000) {
            diskonUtama = 0.20;
        } else if (totalBelanja >= 250000) {
            diskonUtama = 0.10;
        } else {
            diskonUtama = 0.0;
        }
        double totalSetelahDiskon = totalBelanja * (1 - diskonUtama);
        double diskonTambahan;

        switch (member) {
            case "Platinum":
                diskonTambahan = 0.05;
                break;
            case "Gold":
                diskonTambahan = 0.03;
                break;
            case "Silver":
                diskonTambahan = 0.02;
                break;
            default:
                diskonTambahan = 0.0;
        }

        return totalSetelahDiskon * (1 - diskonTambahan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Masukkan angka yang valid untuk total belanja.");
            scanner.close();
            return;
        }
        double totalBelanja = scanner.nextDouble();
        scanner.nextLine(); 

        if (totalBelanja < 0) {
            System.out.println("Error: Total belanja tidak boleh negatif.");
            scanner.close();
            return;
        }

        System.out.print("Masukkan tipe member (Platinum/Gold/Silver/Tidak ada): ");
        String member = scanner.nextLine();

        double totalAkhir = hitungTotalAkhir(totalBelanja, member);
        String statusDiskon = (totalBelanja > 250000) ? "Ya" : "Tidak";

        System.out.println("Total belanja setelah diskon: Rp " + totalAkhir);
        System.out.println("Pelanggan mendapatkan diskon: " + statusDiskon);

        scanner.close();
    }
}
