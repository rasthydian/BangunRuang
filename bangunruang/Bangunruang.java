

package com.mycompany.bangunruang;


public class Bangunruang {

    float luas(){
        System.out.println("Menghitung luas");
        return 0;
    }
    float keliling(){
        System.out.println("Menghitung keliling");
        return 0;
    }   
    float Volume(){
        System.out.println("Menghitung");
        return 0;
    }
   public static void main (String[] args){
       Bangunruang bangunRuang = new Bangunruang();
       //bola
       Bola bola = new Bola();
       bola.r= 0;
       //tabung
       Tabung tabung = new Tabung ();
       tabung.r = 0;
       tabung.t = 1;
       //limasSegitiga
       LimasSegitiga limasSegitiga =  new LimasSegitiga();
       limasSegitiga.t=2;
       limasSegitiga.sisi=3;
       //kubus
       Kubus kubus = new Kubus();
       kubus.sisi=4;
       
       bangunRuang.luas();
       bangunRuang.keliling();
       bangunRuang.Volume();
       
       tabung.luas();
       tabung.keliling();
       tabung.Volume();
       
       limasSegitiga.luas();
       limasSegitiga.keliling();
       limasSegitiga.Volume();
       
       kubus.luas();
       kubus.keliling();
       kubus.Volume();
       
   }
}
