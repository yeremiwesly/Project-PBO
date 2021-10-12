/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Lenovo
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("PERSEGI PANJANG");
        System.out.println("Panjang: 10, Lebar :5");
        System.out.println("Luas : " + pp.hLuas(10, 5));
        System.out.println("Keliling : " + pp.hKeliling(10, 5));
        
        System.out.println("Panjang: 3.6, Lebar :8");
        System.out.println("Luas : " + pp.hLuas(3.6, 8));
        System.out.println("Keliling : " + pp.hKeliling(3.6, 8));
        
        System.out.println("Panjang: 6, Lebar :8.3");
        System.out.println("Luas : " + pp.hLuas(6, 8.3));
        System.out.println("Keliling : " + pp.hKeliling(6, 8.3));
        
        System.out.println("Panjang: 5.6, Lebar :8.8");
        System.out.println("Luas : " + pp.hLuas(5.6, 8.8));
        System.out.println("Keliling : " + pp.hKeliling(5.6, 8.8));
        System.out.println("============================");
        
        Persegi p = new Persegi();
        System.out.println("PERSEGI");
        System.out.println("Panjang sisi: 4.5");
        System.out.println("Luas : " + p.hLuas(4.5));
        System.out.println("Keliling : " + p.hKeliling(4.5));
        
        System.out.println("Panjang sisi: 7");
        System.out.println("Luas : " + p.hLuas(7));
        System.out.println("Keliling : " + p.hKeliling(7));
        System.out.println("============================");
        
        Lingkaran l = new Lingkaran();
        System.out.println("LINGKARAN");
        System.out.println("Jejari: 5");
        System.out.println("Luas : " + l.hLuas(5));
        System.out.println("Keliling : " + l.hKeliling(5));
        
        System.out.println("Jejari: 7.4");
        System.out.println("Luas : " + l.hLuas(7.4));
        System.out.println("Keliling : " + l.hKeliling(7.4));
        System.out.println("============================");
        
        Segitiga s = new Segitiga();
        System.out.println("SEGITIGA");
        System.out.println("Panjang alas: 8, Tinggi: 10");
        System.out.println("Luas : " + s.hLuas(8, 10));
        System.out.println("Keliling : " + s.hKeliling(8, 10));
        
        System.out.println("Panjang alas: 8, Tinggi: 11.5");
        System.out.println("Luas : " + s.hLuas(8, 11.5));
        System.out.println("Keliling : " + s.hKeliling(8, 11.5));
        
        System.out.println("Panjang alas: 12.2, Tinggi: 9");
        System.out.println("Luas : " + s.hLuas(12.2, 9));
        System.out.println("Keliling : " + s.hKeliling(12.2, 9));
        
        System.out.println("Panjang alas: 13.9, Tinggi: 20.7");
        System.out.println("Luas : " + s.hLuas(13.9, 20.7));
        System.out.println("Keliling : " + s.hKeliling(13.9, 20.7));
        System.out.println("============================");
    }
    
}
