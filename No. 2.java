import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        System.out.println("Deret bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
