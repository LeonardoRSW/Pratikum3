public class MahasiswaBeraksi {
    public static void main (String[] args){
        Mahasiswa anton = new Mahasiswa();

        anton.nim = "10102020";
        anton.nama = "Anton Santoso";
        anton.jk = "Laki-Laki";
        anton.umur = 19;
        anton.alamat = "Jl Kampung kandang";
        anton.Jurusan = "Teknik informatika";

        anton.cetakinfo();
    }
}