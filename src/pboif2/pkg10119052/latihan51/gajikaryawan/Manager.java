package pboif2.pkg10119052.latihan51.gajikaryawan;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * gaji karyawan dengan menggunakan polymorpism
 * 
 */
public class Manager extends Karyawan {
     private int kehadiran;
    private float tunjanggolongan,tunjangjabatan,tunjangkehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    public float tunjangKehadiran(int hadir){
        
        return hadir*10000;
    }
    
    public float tunjangJabatan(String jabatan){
        switch(jabatan){
            case "manager" :
               tunjangjabatan = 20000000;
                break;
            case "kabag" :
               tunjangjabatan = 10000000;
                break;
            default:
                tunjangjabatan = 0;
                break;
        }
       return tunjangjabatan;
     
     }
     
      public float tunjangGolongan(int golongan){
         switch(golongan){
             case 1: 
                 tunjanggolongan = 500000;
                 break;
             case 2 :
                 tunjanggolongan = 1000000;
                 break;
             case 3 :
                  tunjanggolongan =1500000;
                 break;
                 default:
                     tunjanggolongan = 0;
                     break;
         }
        return tunjanggolongan;
    }  
      public float gajitotal(){
          return tunjangjabatan+tunjanggolongan+tunjangkehadiran;
      }
}
