package pkg2.tekçift;

import java.util.Scanner;

public class TekÇift {

    public static void main(String[] args) {
        System.out.println("Sayi gir: ");
        Scanner scan = new Scanner(System.in);
        int a;
        a=scan.nextInt();
        
        if(a%2==0)
            System.out.println("Bu sayı çift.");
        else
            System.out.println("Bu sayı tek.");
        
    }
    
}
