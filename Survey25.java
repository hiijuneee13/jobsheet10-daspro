import java.util.Scanner;

public class Survey25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;
        int[][] nilai = new int[responden][pertanyaan];

        System.out.println("=== PROGRAM SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Masukkan nilai 1-5 untuk setiap pertanyaan.\n");

        // a. Menyimpan hasil survei
        for (int i = 0; i < responden; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < pertanyaan; j++) {
                while (true) {
                    System.out.print("  Nilai pertanyaan " + (j + 1) + " (1-5): ");
                    int input = sc.nextInt();
                    if (input >= 1 && input <= 5) {
                        nilai[i][j] = input;
                        break;
                    } else {
                        System.out.println("  Nilai tidak valid! Harus antara 1 - 5.");
                    }
                }
            }
        }

        // b. Menampilkan rata-rata tiap responden
        System.out.println("\n--- RATA-RATA TIAP RESPONDEN ---");
        for (int i = 0; i < responden; i++) {
            int total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += nilai[i][j];
            }
            double rata = (double) total / pertanyaan;
            System.out.printf("Responden %d : %.2f%n", (i + 1), rata);
        }

        // c. Menampilkan rata-rata tiap pertanyaan
        System.out.println("\n--- RATA-RATA TIAP PERTANYAAN ---");
        for (int j = 0; j < pertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < responden; i++) {
                total += nilai[i][j];
            }
            double rata = (double) total / responden;
            System.out.printf("Pertanyaan %d : %.2f%n", (j + 1), rata);
        }

        // d. Menampilkan rata-rata keseluruhan
        int totalKeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalKeseluruhan += nilai[i][j];
            }
        }
        double rataKeseluruhan = (double) totalKeseluruhan / (responden * pertanyaan);
        System.out.printf("\nRata-rata keseluruhan : %.2f%n", rataKeseluruhan);

        System.out.println("\n=== SELESAI ===");
        sc.close();
    }
}
