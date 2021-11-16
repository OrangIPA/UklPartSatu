//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SeleksiKondisi {
    public static void main(String[] args) {
        System.out.println("---==== Bhakti Alam Cottage ====---");
        String pelanggan[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
        String jenisHari[] = {"weekday", "weekend", "holiday"};
        String tipeCottage[] = {"Duku", "Jeruk", "Alpukat", "Jambu Air", "Durian", "Melon", "Belimbing", "Mangga", "Kedondong", "Barrack"};
        int harga[][] = {
                {915000, 915000, 575000, 575000, 595000, 595000, 495000, 495000, 495000, 25000},
                {1025000, 1025000, 695000, 695000, 715000, 715000, 575000, 575000, 575000, 25000},
                {1225000, 1225000, 895000, 895000, 915000, 915000, 755000, 755000, 755000, 35000}
        };
        Scanner input = new Scanner(System.in);
        int id, totalHari, item;
        String hari, kendaraan;
        System.out.print("Masukkan id: ");
        id = input.nextInt();
        System.out.println("Welcome, " + pelanggan[id - 1] + "!");
        while(true){
            System.out.println("Hari apa ini? [weekday/ weekend/ holiday]");
            hari = input.nextLine();
            if (hari.equalsIgnoreCase("weekday") || hari.equalsIgnoreCase("weekend") || hari.equalsIgnoreCase("holiday")){
                break;
            } else{
                System.out.println("input salah!");
            }
        }
        while (true) {
            System.out.print("1. Duku\n2. Jeruk\n3. Alpukat\n4. Jambu Air\n5. Durian\n6. Melon\n7. Belimbing\n8. Mangga\n9. Kedondong\n10. Barrack\n");
            System.out.print("Apa yang ingin anda pesan? ");
            item = input.nextInt();
            if(item < 1 || item > 10){
                System.out.println("input salah!");
                continue;
            }
            System.out.print("Berapa hari anda memesannya? ");
            totalHari = input.nextInt();
            break;
        }
        System.out.print("Apa jenis kendaraan anda? ");
        kendaraan = input.nextLine();
        System.out.println("Id : " + id);
        System.out.println("Nama Pelanggan : " + pelanggan[id - 1]);
        System.out.println("Jumlah Hari : " + totalHari);
        System.out.println("Golongan Hari" + hari);
        System.out.println("Tipe Cottage : " + tipeCottage[item-1]);
        System.out.println("Jenis Kendaraan : " + kendaraan);
        System.out.println("Harga : " + harga[Arrays.asList(jenisHari).indexOf(hari)][item-1] * totalHari);
    }
}

