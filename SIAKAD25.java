import java.util.Scanner;

public class SIAKAD25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int mahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int Matkul = sc.nextInt();
        sc.nextLine(); 

        String[] namaMatkul = new String[Matkul];
        for (int i = 0; i < Matkul; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = sc.nextLine();
        }

        int[][] nilai = new int[mahasiswa][Matkul];

        for (int i = 0; i < mahasiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < Matkul; j++) {
                System.out.print("Nilai mata kuliah " + namaMatkul[j] + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            double rataPerSiswa = totalPerSiswa / Matkul;
            System.out.println("Rata-rata mahasiswa ke-" + (i + 1) + ": " + rataPerSiswa);
        }

        System.out.println("\n===========================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah:");

        for (int j = 0; j < Matkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < mahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataPerMatkul = totalPerMatkul / mahasiswa;
            System.out.println(namaMatkul[j] + " : " + rataPerMatkul);
        }

        sc.close();
    }
}
