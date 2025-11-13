import java.util.Scanner;

public class SIAKAD25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];
        String[] namaMatkul = {"Dasar Pemrograman", "Matematika", "CTPS"}; 

       
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + namaMatkul[j] + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            double rataPerSiswa = totalPerSiswa / nilai[i].length;
            System.out.println("Nilai rata-rata: " + rataPerSiswa);
            System.out.println();
        }

      
        System.out.println("\n==============================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah:");

        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataPerMatkul = totalPerMatkul / nilai.length;
            System.out.println("Mata Kuliah " + (j + 1) + " : " + rataPerMatkul);
        }

        sc.close();
    }
}
