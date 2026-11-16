package com.mycompany.soru9;

import java.util.Scanner;

public class Soru9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int toplam = 0;
        
        int pozitif = 0;
        
        int negatif = 0;
        
        int sifir = 0;
        
        int number;
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.print("Sayi girin: ");
            number = input.nextInt();
            
            toplam = toplam + number;
            
            if (number < 0) {
                
                negatif++;
                
            }
            
            else if (number > 0) {
                
                pozitif++;
                
            }
            
            else {
                
                sifir++;
                
            }
            
        }
        
        double ortalama = toplam / 10.0;
        
        System.out.println("Toplam: " + toplam);
        
        System.out.println("Pozitif sayi: " + pozitif);
        
        System.out.println("Negatif sayi: " + negatif);
        
        System.out.println("Sifir sayi: " + sifir);
        
        System.out.println("Ortalama: " + ortalama);
        
    }
}