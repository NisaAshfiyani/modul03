
package pencarian_squential;

import java.util.Scanner;

public class pencarian_binary {
    public static void main (String[] args){
    //pendeklarasian variabel 
     int B[] = {7, 9, 11, 13, 15};
     Scanner input = new Scanner (System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
     int cari = 9; 
     int IndeksAwal = 0; //0
     int IndeksAkhir = B. length-1; //4
     int ketemu = 0; 
     int point = 0; 
    //menampilkan data dalam array
     System.out.println ("isi data adalah "); 
      for (int i = 0; i < B.length; i++) { 

          System. out.print (B[i] + " "); 
      }
          System.out.println ("");
          System.out.println ("");
        
          while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) { 
          point = (IndeksAwal + IndeksAkhir) / 2; //2 //0+1/2=0.5-1 //0+3/2= //
          System.out.println ("indeks pointer :"+ point );
          if(cari == B[point]){
                ketemu = 1;
                System.out.println("Data " +cari + " Telah Ditemukan pada Indeks ke "+ point);
        }
            else if (cari < B[point]){
                System.out.println("Cari dikiri ");
                IndeksAkhir = point - 1;
            }
            
            else {
                IndeksAwal = point + 1;
                System.out.println("Cari dikanan ");
            }
    }
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan ");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan ");
        
        System.out.println();
        System.out.println("** NISA ASHFIYANI **");
    }
}
    

