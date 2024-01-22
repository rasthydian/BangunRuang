
package com.mycompany.bangunruang;


public class Tabung extends Bangunruang{
    float r;
    float t;
    float luas(){
        float luas = (float) (2 * Math.PI * r * (r+t));
        System.out.println("Luas tabung: " + luas);
        return luas;
    }
    float keliling(){
        float keliling = (float) (2* Math.PI * r);
        System.out.println("Keliling tabung: " + keliling);
        return keliling;
    }
    float volume(){
        float volume = (float) (Math.PI * r*r*t);
        System.out.println("volume tabung: "+volume);
        return volume;
    }
}
