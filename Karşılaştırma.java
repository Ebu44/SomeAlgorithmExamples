/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.karşılaştırma;

import java.util.Scanner;

/**
 *
 * @author ebube
 */
public class Karşılaştırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x, y;
        System.out.println("x gir:");
        x = scn.nextDouble();
        System.out.println("y gir:");
        y = scn.nextDouble();
        
        if(x>y){
            System.out.println("x büyüktür y den");
        }else{
            System.out.println("y büyüktür x den");
        }

    }

}
