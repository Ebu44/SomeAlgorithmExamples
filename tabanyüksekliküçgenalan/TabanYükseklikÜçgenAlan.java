/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.tabanyüksekliküçgenalan;

import java.util.Scanner;

/**
 *
 * @author ebube
 */
public class TabanYükseklikÜçgenAlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x, y, hipo;
        System.out.println("x gir:");
        x = scn.nextDouble();
        System.out.println("y gir:");
        y = scn.nextDouble();
        hipo = (x*y)/2;
        System.out.println("Üçgenin Alanı :"+ hipo);
    }

}
