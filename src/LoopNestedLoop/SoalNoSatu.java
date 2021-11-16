package LoopNestedLoop;

public class SoalNoSatu {
    public static void main(String[] args) {
        int a = 5, b = 7, n = 11, u = a, s = a;

        System.out.print("Deret Aritmatikanya Adalah: (");
        for(int i = 0; i < n; i++){
            if(i == 0)
                System.out.print(u);
            else
                System.out.print(", " + u);
            u += b;
            s += u;
        }
        System.out.print(")\n");
        s = s - u;
        System.out.println("Jumlah Deret Matematikanya Adalah: " + s);
    }
}
