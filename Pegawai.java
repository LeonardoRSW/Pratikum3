public class Pegawai{
    private String nama;
    private double gajiPokok;

    public void setNama(String Nama){
        this.nama = Nama;
    }
    public String getNama(){
        return this.nama;
    }

    public void setgajiPokok(double gajipokok){
        this.gajiPokok = gajipokok;
    }
    public double getgajiPokok(){
        return this.gajiPokok;
    }

    public void cetakinfo(){
        System.out.println("Nama = " + getNama());
        System.out.println("Gaji Pokok = " + getgajiPokok());
    }
}
