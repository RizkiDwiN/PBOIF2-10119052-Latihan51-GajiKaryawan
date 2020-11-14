package pboif2.pkg10119052.latihan51.gajikaryawan;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * gaji karyawan dengan menggunakan polymorpism
 * 
 */
public class PBOIF210119052Latihan51GajiKaryawan {

    public static void main(String[] args) {
       Manager manager = new Manager();
        Scanner userInput = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan Nik : ");
        manager.setNik(userInput.nextLine());
        System.out.print("Masukkan Nama : ");
        manager.setNama(userInput.nextLine());
        System.out.print("Masukkan Golongan(1/2/3) :");
        manager.setGolongan(userInput.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag ) :");
        manager.setJabatan(userInput.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(userInput.nextInt());
        System.out.println("");
        System.out.print("====Hasil Perhitungan====");
        System.out.println("NIK      : "+manager.getNik());
        System.out.println("NAMA     : "+manager.getNama());
        System.out.println("GOLONGAN : "+manager.getGolongan());
        System.out.println("JABATAN  : "+manager.getJabatan());
        System.out.println("TUNJANGAN GOLONGAN  : "+manager.tunjangGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : "+manager.tunjangJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+manager.tunjangKehadiran(manager.getKehadiran()));
        System.out.println("GAJI TOTAL : "+manager.gajitotal());
    }
    
}
