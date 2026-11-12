package tugas_pertemuan3;
import java.util.Scanner;

public class Tugas_Pertemuan3C {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        String barang [][];
        int jumlah;
        
        System.out.println("PENJUALAN BARANG");
        System.out.print("Jumlah Pembeli : ");
        jumlah = Integer.parseInt(input.nextLine());

        barang = new String[jumlah][6];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPembeli ke-" + (i+1));

            System.out.print("Nama Pembeli : ");
            barang[i][0] = input.nextLine();
            System.out.print("Kode Barang (A01/B02/C02) : ");
            barang[i][1] = input.nextLine();
            System.out.print("Jumlah : ");
            barang[i][3] = input.nextLine();

            if (barang[i][1].equalsIgnoreCase("A01")) {
                barang[i][2] = "Hardisk";
                barang[i][4] = "700000";
            } else if (barang[i][1].equalsIgnoreCase("B02")) {
                barang[i][2] = "Monitor";
                barang[i][4] = "800000";
            } else if (barang[i][1].equalsIgnoreCase("C02")) {
                barang[i][2] = "Mouse";
                barang[i][4] = "50000";
            }


            int bayar = Integer.parseInt(barang[i][3])
                      * Integer.parseInt(barang[i][4]);

            barang[i][5] = String.valueOf(bayar);
        }

        System.out.println("\n================================================================");
        System.out.println("No.\tNama\t\tKode\tNama Barang\tJumlah\tHarga\tBayar");
        System.out.println("================================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + "\t"
                    + barang[i][0] + "\t\t"
                    + barang[i][1] + "\t"
                    + barang[i][2] + "\t\t"
                    + barang[i][3] + "\t"
                    + barang[i][4] + "\t"
                    + barang[i][5]);
        }
    }
    
}
