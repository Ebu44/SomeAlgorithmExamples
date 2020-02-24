/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.kmtomil;

import java.util.Scanner;

/**
 *
 * @author ebube
 */
public class KmtoMil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        float a;
        System.out.println("Sayı gir koçum");
        a = scn.nextFloat();
        float b = (float) (a*(0.621));
        System.out.println("anan :"+ b);
        
    }
    
}
