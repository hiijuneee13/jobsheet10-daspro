import java.util.Arrays;

public class Numbers25 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];
        for (int i=0;i<myNumbers.length;i++) {
            System.out.println("Baris "+i+" : "+Arrays.toString(myNumbers[i]));
        }
        myNumbers[0][2] = 99;
        System.out.println("Setelah ubah nilai:");
        for (int i=0;i<myNumbers.length;i++) {
            System.out.println("Baris "+i+" : "+Arrays.toString(myNumbers[i]));
        }
        myNumbers[1] = new int[6];
        System.out.println("Setelah ganti panjang baris 1:");
        for (int i=0;i<myNumbers.length;i++) {
            System.out.println("Baris "+i+" : "+Arrays.toString(myNumbers[i]));
        }
    }
}
