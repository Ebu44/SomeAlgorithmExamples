/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.aralıktakisayılarıtoplama;

import java.util.Scanner;

/**
 *
 * @author ebube
 */
public class AralıktakiSayılarıToplama {

    public static void main(String[] args) {
        double a, b, c, d = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Başlangıç giriniz");
        a = scn.nextInt();
        System.out.println("Bitiş giriniz");
        b = scn.nextInt();
        System.out.println("Adım Miktarı giriniz");
        c = scn.nextInt();
        
        for(double i = a; i<=b ;  i+= c ){
            d +=i;
        }
        System.out.println("Toplam :"+ d);
    }

}
