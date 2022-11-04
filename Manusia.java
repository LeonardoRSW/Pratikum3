public class Manusia {
    String nama;
    String jk;
    int umur;
    String alamat;

    public void setNama(String Nama){
        this.nama = Nama;
    }
    public String getNama(){
        return this.nama;
    }

    public void setjk(String jk){
        this.jk = jk;
    }
    public String getjk(){
        return this.jk;
    }

    public void setumur(int umur){
        this.umur = umur;
    }

    public int getumur(){
        return this.umur;
    }

    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getalamat(){
        return this.alamat;
    }
    
    public void cetakinfo() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Jenis Kelamin = " +this.jk);
        System.out.println("Umur = " + this.umur);
        System.out.println("Alamat = "+ this.alamat);
    }
}