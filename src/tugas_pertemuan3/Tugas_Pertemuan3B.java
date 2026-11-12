package tugas_pertemuan3;
import java.util.Scanner;

public class Tugas_Pertemuan3B {
    public static void main (String args []) {
        Scanner input = new Scanner (System.in);
        String tiket[][];
        int jumlah;
        
        System.out.println("PEMBELIAN TICKET");
        System.out.print("Jumlah Pembeli : ");
        jumlah = Integer.parseInt(input.nextLine());
        
        tiket = new String[jumlah][6];
        for(int i=0; i<jumlah; i++){
            System.out.println("\nPembeli ke-" +(i+1));
            System.out.print("Nama : ");
            tiket[i][0]=input.nextLine();
            System.out.print("Jurusan (Bandung/Jakarta) : ");
            tiket[i][1]=input.nextLine();
            System.out.print("Kelas (Ekonomi/Bisnis) : ");
            tiket[i][2]=input.nextLine();
            System.out.print("Jumlah Tiket : ");
            tiket[i][3]=input.nextLine();
        
            if(tiket[i][1].equalsIgnoreCase("Bandung")){
                if(tiket[i][2].equalsIgnoreCase("Bisnis")){
                    tiket[i][4]="40000";
                } else if(tiket[i][2].equalsIgnoreCase("Ekonomi")){
                    tiket[i][4]="20000";
                }
            } else if (tiket [i][1].equalsIgnoreCase("Jakarta")) {
                if(tiket[i][2].equalsIgnoreCase("Bisnis")){
                    tiket[i][4]="60000";
                } else if(tiket [i][2].equalsIgnoreCase("Ekonomi")){
                    tiket[i][4] = "40000";
                }
            }
            
            int bayar = Integer.parseInt(tiket[i][3])
                      * Integer.parseInt(tiket[i][4]);
            
            tiket[i][5] = String.valueOf(bayar);
        }
        System.out.println("\n==============================================================");
        System.out.println("No.\tNama\t\tJurusan\t\tKelas\tJumlah\tHarga\tBayar");
        System.out.println("==============================================================");
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + "\t"
                    + tiket[i][0] + "\t\t"
                    + tiket[i][1] + "\t\t"
                    + tiket[i][2] + "\t"
                    + tiket[i][3] + "\t"
                    + tiket[i][4] + "\t"
                    + tiket[i][5]);
        }
        System.out.println("==============================================================");
    }
    
}
