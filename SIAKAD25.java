import java.util.Scanner;

public class SIAKAD25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int siswa = 4, matkul = 3;
        int[][] nilai = new int[siswa][matkul];
        for (int i=0;i<siswa;i++) {
            System.out.println("Nilai siswa "+(i+1));
            for (int j=0;j<matkul;j++) {
                System.out.print("Mata kuliah "+(j+1)+": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rata-rata tiap siswa:");
        for (int i=0;i<siswa;i++) {
            int sum=0; for(int j=0;j<matkul;j++) sum+=nilai[i][j];
            System.out.printf("Siswa %d : %.2f%n",i+1,(double)sum/matkul);
        }
        System.out.println("Rata-rata tiap mata kuliah:");
        for (int j=0;j<matkul;j++) {
            int sum=0; for(int i=0;i<siswa;i++) sum+=nilai[i][j];
            System.out.printf("Matkul %d : %.2f%n",j+1,(double)sum/siswa);
        }
        sc.close();
    }
}
