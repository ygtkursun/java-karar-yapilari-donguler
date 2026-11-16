package com.mycompany.soru8;

import java.util.Scanner;

public class Soru8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tahmin girin: ");
        int tahmin = input.nextInt();
        
        int number = 50;
        
        while (tahmin != number) {
            
            if (tahmin < number) {
                
                System.out.println("Daha buyuk bir sayi gir!");
                tahmin = input.nextInt();
            }
            
            else if (tahmin > number) {
                
                System.out.println("Daha kucuk bir sayi gir!");
                tahmin = input.nextInt();
            }
            
        }
        
        System.out.println("Tahmininiz dogru!");
        
    }
}