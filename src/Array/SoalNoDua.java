package Array;

public class SoalNoDua {
    public static void main(String[] args) {
        int a[][] = {
                {8, 1, -3, 2},
                {2, -1, 9, 3},
                {3, 9, 4, -2}
        };
        int b[][] = {
                {8, 2, 9},
                {2, 4, 9},
                {9, 8, 4},
                {3, 2, 4}
        };
        int h[][] = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 4; k++){
                    h[i][j] += a[i][j] * b[k][j];
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(h[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
