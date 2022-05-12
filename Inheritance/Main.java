package Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("                Uji Coba Kelulusan");
        System.out.println("===================================================");
        System.out.print("Masukkan nama anda : ");
        Mahasiswa.nama = input.nextLine();
        System.out.print("Masukkan nilai matkul a : ");
        Mahasiswa.a = input.nextDouble();
        System.out.print("Masukkan nilai matkul b : ");
        Mahasiswa.b = input.nextDouble();
        System.out.print("Masukkan nilai matkul c : ");
        Mahasiswa.c = input.nextDouble();
        Mahasiswa.rata_rata = (Mahasiswa1.a + Mahasiswa1.b + Mahasiswa1.c) / 3;
        
        if(Mahasiswa1.a < 50){
            Mahasiswa1.nilai();
        }
        else if(Mahasiswa1.b < 50){
            Mahasiswa1.nilai();
        }
        else if(Mahasiswa1.c < 50){
            Mahasiswa1.nilai();
        }
        else if(Mahasiswa1.rata_rata < 70){
            Mahasiswa1.nilai();
        }
        else{
            Mahasiswa1.display();
        }
    }
}
