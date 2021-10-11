/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author acer
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Project 1");
        System.out.println("-----------------");
        // luas pesegi
        Persegi p = new Persegi();
        double LP = p.hitungLuas(42);
        
        //luas lingkaran
        Lingkaran x = new Lingkaran();
        double LL = x.hitungLuas(21);
        
        // hitung luas bangun total
        // luas total = luas persegi + luas lingkaran dikali 2
        double luasTotal = LP + (LL*2);
        
        System.out.println("Luas Persegi  : " + LP + " cm");
        System.out.println("Luas Lingkaran : " + LL*2 + " cm");
        System.out.println("Luas Total : " + luasTotal + " cm\n\n");
       
        
        
        
        System.out.println("Project 2");
        System.out.println("-----------------");
        
        //lingkaran besar
        Lingkaran a = new Lingkaran();
        double LB    = a.hitungLuas(14)/2;
        
        //lingkaran kecil 
        Lingkaran b = new Lingkaran();
        double LK = b.hitungLuas(7);
        
        // luas daerah warna abu abu
        double hasil = LB - LK;
        
        System.out.println("Luas 1/2 Lingkaran Besar : " + LB + " cm");
        System.out.println("Luas 1 Lingkaran Kecil : " + LK + " cm");
        System.out.println("Luas Daerah Berwarna Abu-abu : " + hasil + " cm");
    }
    
}

