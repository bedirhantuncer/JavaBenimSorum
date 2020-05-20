/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author sadievrenseker
 */
public class muhendis extends insan{
    int maas;
    public muhendis(){
        this(7000);
    }
    public muhendis(int maas){
        if(maas>0){
            this.maas = maas;
        }else{
            this.maas = 7000;
        }
    }
    public muhendis(int maas,int boy, int kilo){
        super(boy,kilo);
    }
    int zam(){
        maas++;
        return maas;
    }
    //overloading
    int zam(int zamMiktari){
        maas += zamMiktari;
        return maas;
    }
    int zam(float zamOrani){
        float artis = zamOrani * maas;
        zam((int)artis);
        return maas;
    }
    
    // overriding 
    void yemek(){
        kilo = kilo + 2;
    }
    void yemek(int kilo){
        this.kilo += kilo;
    }
}
