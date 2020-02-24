/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.geometrikortalama;

import java.util.Scanner;

/**
 *
 * @author ebube
 */
public class GeometrikOrtalama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b=1,c=0;
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Sayı giriniz, Çıkmak için 0 a basınız");
            a = scn.nextInt();
            if(a != 0){
                b *= a;
                c++;
            }
        }while(a!=0);
        b = Math.pow(b, 1/c);
        System.out.println("Geometrik Ortalama :" + b);
    }
    
}
