/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14.bölümdenkalanhesaplama;

import java.util.Scanner;

/**
 *
 * @author ebube
 */
public class BölümdenKalanHesaplama {

    public static void main(String[] args) {
        double a, b, c = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Bölüneni giriniz");
        a = scn.nextInt();
        System.out.println("böleni giriniz");
        b = scn.nextInt();
        c = a % b;
        System.out.println("Kalan :"+ c);
    }

}
