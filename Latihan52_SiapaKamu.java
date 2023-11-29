
package oop;
class manusia{
    String nama;
    int umur;
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public int getumur(){
        return umur;
    }
    
    public void setumur(int umur){
        this.umur = umur;
    }
    
    void siapakamu(){
        System.out.println("Saya manusia");
    }
}

class dosen{
    String nip;
    String matakuliah;
    
    public String getnip(){
        return nip;
    }
    
    public void setnip(String nip){
        this.nip = nip;
    }
    
    public String getmatakuliah(){
        return matakuliah;
    }
    
    public void setmatakuliah(String matakuliah){
        this.matakuliah = matakuliah;
    }
    
    void mengajarapa(){
        System.out.println("Saya Riski Kurniawan umur 27 tahun sedang mengajar PBO");
    }
    
    void siapakamu(){
        System.out.println("Saya Dosen");
    }
}

class mahasiswa{
    String nim;
    String kelas;
    
    public String getnim(){
        return nim;
    }
    
    public void setnim(String nim){
        this.nim = nim;
    }
    
    public String getkelas(){
        return kelas;
    }
    
    public void setkelas(String kelas){
        this.kelas = kelas;
    }
    
    void kelasapa(){
        System.out.println("Saya Fatih Muzaqi umur 18 tahun sedang belajar di kelas PBO");
    }
    
    void siapakamu(){
        System.out.println("Saya Mahasiswa");
    }
}

public class Latihan52_SiapaKamu {
    public static void main(String[] args) {
        dosen dosen1 = new dosen();
        System.out.println("NIP DOSEN : 2313311403");
        dosen1.siapakamu();
        dosen1.mengajarapa();
        System.out.println("");
        mahasiswa mahasiswa1 = new mahasiswa();
        System.out.println("NIM MAHASISWA : 22205026");
        mahasiswa1.siapakamu();
        mahasiswa1.kelasapa();
    }
}
