
package pencarian_squential;
public class pencarian_sequential {
    public static void main (String [] args){
        int A [] = {10, 12, 8, 9, 15};
        int cari = 8;
        int ketemu = 0;
        
        System.out.println("ini data A adalah: ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println("");
        System.out.println("");
        
        for (int i=0; i<A.length; i++){
            if (A[i] == cari){
                ketemu = 1;
                System.out.println(" data "  + cari +  " berada pada indeks ke 2 baris ke 3");
            }
        }
        System.out.println("");
        System.out.println("");
        
        if (ketemu == 1)
            System.out.println ("komplemen data ditemukan");
        else
            System.out.println("kesimpulan data yang ditemukan");
            }
        }

