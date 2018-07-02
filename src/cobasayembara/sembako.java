
package cobasayembara;
import java.util.Scanner;
/**
 *
 * @author Hanafi
 */
public class sembako {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pilih,jml,hrg;
        
    System.out.println("=========================");
    System.out.println("Program Penghitung Jualan Sembako Hanafi");
    System.out.println("=========================");
    System.out.println("Menyediakan :");
    System.out.println("1. Beras\n2. Minyak Goreng\n3. Telur");
    System.out.println("4. Gula");
    
    System.out.print("Masukkan pilihan       = ");
    pilih = in.nextInt();
    switch(pilih){
        case 1: System.out.println("Anda membeli beras");
                System.out.print("Masukkan jumlah beras yang dibeli (liter) = ");
                jml = in.nextInt();
                hrg = 12000*jml;
                System.out.println("Total yang dibayar     = Rp."+hrg);
                break;
                
        case 2: System.out.println("Anda membeli minyak goreng");
                System.out.print("Masukkan jumlah minyak goreng yang dibeli (liter) = ");
                jml = in.nextInt();
                hrg = 8000*jml;
                System.out.println("Total yang dibayar     = Rp."+hrg);
                break;
                
       case 3: System.out.println("Anda membeli telur");
                System.out.print("Masukkan jumlah telur yang dibeli (kg) = ");
                jml = in.nextInt();
                hrg = 12500*jml;
                System.out.println("Total yang dibayar     = Rp."+hrg);
                break;  
 
        case 4: System.out.println("Anda membeli gula");
                System.out.print("Masukkan jumlah gula yang dibeli (kg) = ");
                jml = in.nextInt();
                hrg = 10000*jml;
                System.out.println("Total yang dibayar     = Rp."+hrg);
    }
    }
}
