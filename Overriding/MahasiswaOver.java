package Overriding;

public class MahasiswaOver extends Mahasiswa {
    //Overriding
    static void nilai(){
        System.out.println("===================================================");
        System.out.println("         Selamat " + Mahasiswa.nama + ", anda lulus");
        System.out.println("===================================================");
    }
}
