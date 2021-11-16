package LoopNestedLoop;

public class SoalNoTiga {
    public static void main(String[] args) {
        int a = 5, b = 7, u = a, s = a;
        System.out.println("Deret Aritmatikanya Adalah: ");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(u + "\t");
                u += b;
                s += u;
            }
            System.out.println();
        }
        s -= u;
        System.out.println("Jumlah Deret Aritmatikanya Adalah " + s);
    }
}
