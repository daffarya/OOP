package Polymorphism;

public class Segitiga extends Luas{
    int alas, tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas(){
        return this.alas * this.tinggi / 2;
    }
}
