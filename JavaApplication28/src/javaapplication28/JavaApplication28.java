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

public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       insan ali = new insan();
       muhendis veli = new muhendis(20000,180,80);
       veli.boy = 180;
       System.out.println(veli.boy);
       veli.kilo= 90;
       veli.yemek();
       System.out.println(veli.kilo);
      // veli.maas= 10000;
       veli.zam((float)0.50);
    
       System.out.println(veli.maas);
       ali.kilo = 80;
       ali.yemek();
       System.out.println(ali.kilo);

    }
    
}
