package com.mycompany.soru2;

import java.util.Scanner;

public class Soru2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int number = input.nextInt();
        
        int toplam1 = 0;
        
        int toplam2 = 0;
        
        for (int i = 1; i <= number; i++) {
            
            if (i % 2 == 0) {
                
                toplam2 = toplam2 + i;
                
            }
            
            else {
                
                toplam1 = toplam1 + i;
                
            }
            
        }
        
        System.out.println("Tek sayilarin toplami: " + toplam1);
            
        System.out.println("Cift sayilarin toplami: " + toplam2);
        
    }
}