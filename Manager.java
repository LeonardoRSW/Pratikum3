public class Manager extends Pegawai {
    private double Tunjangan;
    

    public void setTunjangan(double tunjangan){
        this.Tunjangan = tunjangan;
    }
    public double getTunjangan(){
        return this.Tunjangan;
    }
    public void cetakinfo(){
        super.cetakinfo();  
        System.out.println("Tunjangan = " + getTunjangan());
}
}