package jamal;

import java.util.*;

public class Main
{
    public static void main(String args[]) {
    
        int penghitung;
        
        Random angkaAcak = new Random();
        
        System.out.println("Angka Acak : ");
        
        System.out.println("-----------------");
        
        for (penghitung = 1; penghitung <= 5; penghitung++) {
            
            System.out.println(angkaAcak.nextInt(100));
        }
        System.out.println("------------------------");
    }
}
