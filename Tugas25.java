import java.util.Scanner;

public class Tugas25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("=== INPUT NILAI SURVEI (1 - 5) ===");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                int nilai;
                while (true) {
                    System.out.print("Nilai pertanyaan ke-" + (j + 1) + " : ");
                    if (!sc.hasNextInt()) {
                       
                        System.out.println("Nilai survei tidak valid! Masukkan nilai survei antara 1 - 5.");
                        sc.next(); 
                        continue;
                    }

                    nilai = sc.nextInt();

                    if (nilai < 1 || nilai > 5) {
                        System.out.println("Nilai survei 1 - 5. Silakan coba lagi.");
                        continue;
                    }

                    break;
                }
                survey[i][j] = nilai;
            }
        }

        System.out.println("\n=== RATA-RATA PER RESPONDEN ===");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survey[i][j];
            }
            double rata = total / jumlahPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + " : " + String.format("%.2f", rata));
        }

        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }
            double rata = total / jumlahResponden;
            System.out.println("Pertanyaan ke-" + (j + 1) + " : " + String.format("%.2f", rata));
        }

        double totalSemua = 0;
        int jumlahData = jumlahResponden * jumlahPertanyaan;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalSemua += survey[i][j];
            }
        }
        double rataKeseluruhan = totalSemua / jumlahData;
        System.out.println("\n=== RATA-RATA NILAI SURVEI KESELURUHAN ===");
        System.out.println("Nilai rata-rata survei keseluruhan: " + String.format("%.2f", rataKeseluruhan));

        sc.close();
    }
}
