package Array;

public class SoalNoSatu {
    public static void main(String[] args) {
        int a[][] = {
                {-7, 5, 1, -1},
                {4, 8, 9, 9},
                {9, -2, 3, 4}
        };
        int b[][] = {
                {-2, 5, 6, 3},
                {4, -2, 3, 9},
                {7, -9, 2, -8},
        };

        System.out.println("Hasil A - B: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(a[i][j]-b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
