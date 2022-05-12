package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Luas HitungLuas = new Luas();
        Persegi LuasPersegi = new Persegi(14);
        Segitiga LuasSegitiga = new Segitiga(14, 20);
        Lingkaran LuasLingkaran = new Lingkaran(7);

        HitungLuas.luas(); 

        System.out.println("Luas Persegi : " + LuasPersegi.luas());
        System.out.println("Luas Segitiga : " + LuasSegitiga.luas());
        System.out.println("Luas Lingkaran : " + LuasLingkaran.luas());
    } 
}
