public class Programmer extends Pegawai{
    private double Bonus;
    public void setBonus(double bonus){
        this.Bonus =bonus;
    }
    public double getBonus(){
        return this.Bonus;
    }
    public void cetakinfo(){
        super.cetakinfo();  
        System.out.println("Bonus = " + getBonus());
}
}