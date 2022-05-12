package Polymorphism;

public class Lingkaran {
    int r;

    public Lingkaran(int r){
        this.r = r;
    }
    public float luas(){
        return (float) (Math.PI * r * r);
    }
}
