package Inheritance;

public class Mahasiswa {
    static double a, b, c, rata_rata;
    static String nama;

    static void display(){
        System.out.println("===================================================");
        System.out.println("         Selamat " + Mahasiswa.nama + ", anda lulus");
        System.out.println("===================================================");
    }
    static void nilai(){
        System.out.println("===================================================");
        System.out.println("         Maaf " + Mahasiswa.nama + ", anda tidak lulus");
        System.out.println("===================================================");
    }
}
