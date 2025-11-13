import java.util.Scanner;

public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = 4, kolom = 2;
        String[][] penonton = new String[baris][kolom];

        while (true) {
            System.out.println("\n1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            String menu = sc.nextLine();
            if (menu.equals("1")) {
                while (true) {
                    System.out.print("Masukkan baris (0-" + (baris-1) + ", 'b' untuk kembali): ");
                    String in = sc.nextLine();
                    if (in.equalsIgnoreCase("b")) break;
                    int r, c;
                    try { r = Integer.parseInt(in); } catch (Exception e) { continue; }
                    System.out.print("Masukkan kolom (0-" + (kolom-1) + "): ");
                    try { c = Integer.parseInt(sc.nextLine()); } catch (Exception e) { continue; }
                    if (r<0||r>=baris||c<0||c>=kolom) { System.out.println("Posisi tidak valid!"); continue; }
                    if (penonton[r][c]!=null) { System.out.println("Sudah terisi!"); continue; }
                    System.out.print("Nama penonton: ");
                    penonton[r][c]=sc.nextLine();
                }
            } else if (menu.equals("2")) {
                for (int i=0;i<baris;i++) {
                    for (int j=0;j<kolom;j++) {
                        System.out.print((penonton[i][j]==null?"***":penonton[i][j])+"\t");
                    }
                    System.out.println();
                }
            } else if (menu.equals("3")) break;
        }
        sc.close();
    }
}
