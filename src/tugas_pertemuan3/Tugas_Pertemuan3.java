package tugas_pertemuan3;
import java.util.Scanner;
public class Tugas_Pertemuan3 {
public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        String mahasiswa[][];
        int jumlah;
        System.out.println("DATA NILAI MAHASISWA\nSISTEM "
                + "INFORMASI\nFKOM - UNIKU");
        System.out.println("Jumlah Siswa : ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][6];
        for (int i=0; i<jumlah; i++){
            System.out.println(("Data Mahasiswa ke -") + (i+1));
            System.out.println("NIM : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.println("NAMA : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.println("NILAI UTS : ");
            mahasiswa[i][2] = input.nextLine();
            System.out.println("NILAI UAS : ");
            mahasiswa[i][3] = input.nextLine();
            
            double akhir= (Double.parseDouble(mahasiswa[i][2])*0.5)
                        +(Double.parseDouble(mahasiswa[i][3])*0.5);
            mahasiswa[i][4] = String.valueOf(akhir);
            if(akhir >=80){mahasiswa[i][5] = "A";
            } else if (akhir >= 70) {
                mahasiswa[i][5] = "B";
            } else if (akhir >= 60) {
                mahasiswa[i][5] = "C";
            } else if (akhir >= 50) {
                mahasiswa[i][5] = "D";
            } else {
                mahasiswa[i][5] = "E";
            }         
        }
        System.out.println("\n======================================");
        System.out.println("\nNo.\tNIM\tNAMA\tUTS\tUAS\tNilai Akhir\tIndex\n");
        System.out.println("\n======================================");
        for (int i = 0; i<jumlah; i++){
            System.out.print((i+1)+"\t" 
                    +mahasiswa[i][0]+"\t" 
                    +mahasiswa[i][1] +"\t" 
                    +mahasiswa[i][2] +"\t"
                    +mahasiswa[i][3]+"\t");                    
            System.out.printf("%.1f\t\t%s%n", Double.parseDouble(mahasiswa[i][4]),
                    mahasiswa[i][5]);
        }         System.out.println("\n======================================");
    }
    
}
