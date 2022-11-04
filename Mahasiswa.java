public class Mahasiswa extends Manusia{
    String nim;
    String Jurusan;

    public void setnim(String nim){
        this.nim = nim;
    }
    public String getnim(){
        return this.nim;
    }

    public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan; 
    }
    public String getJurusan(){
        return this.Jurusan;
    }

    public void cetakinfo() {
        System.out.println("Nim = " + this.nim);
        System.out.println("Jurusan = "+ this.Jurusan);
        super.cetakinfo();
    }
}