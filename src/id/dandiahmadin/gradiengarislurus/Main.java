/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.gradiengarislurus;

/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung gradien garis lurus dengan pendekatan object oriented
 * dan penerapan konsep pewarisan, interface
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%n",  koordinat1.getX1(), koordinat1.getY1(), koordinat1.getX2(), koordinat1.getY2());
        System.out.println("memiliki gradien sebesar " + koordinat1.hitungGradien());
        
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%n",  koordinat2.getX1(), koordinat2.getY1(), koordinat2.getX2(), koordinat2.getY2());
        System.out.println("memiliki gradien sebesar " + koordinat2.hitungGradien());
        
    }
    
}
