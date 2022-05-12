package Overriding;

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
        Mahasiswa.rata_rata = (MahasiswaOver.a + MahasiswaOver.b + MahasiswaOver.c) / 3;
        
        if(MahasiswaOver.a < 50){
            Mahasiswa.nilai();
        }
        else if(MahasiswaOver.b < 50){
            Mahasiswa.nilai();
        }
        else if(MahasiswaOver.c < 50){
            Mahasiswa.nilai();
        }
        else if(MahasiswaOver.rata_rata < 70){
            Mahasiswa.nilai();
        }
        else{
            MahasiswaOver.nilai();
        }
    }
}
