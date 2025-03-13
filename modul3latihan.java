import java.util.Scanner;

public class modul3latihan{

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        int jumlahVokal = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
       
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c =='I' || c == 'O' || c == 'U') {
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal dalam teks: " + jumlahVokal);
        input.close();

        switch(jumlahVokal % 2) {
            case 0:
                System.out.println("vokal Genap");
                break;
            default:
                System.out.println("vokal Ganjil");
        }

        char[] chars = kalimat.toCharArray();
        char[] reversed = new char[chars.length];

        int index = chars.length - 1;
        for (char c : chars) {
            reversed[index--] = c;
        }

        System.out.print("kata Terbalik: ");
        for (char c : reversed) {
            System.out.print(c);
        }

    }
}