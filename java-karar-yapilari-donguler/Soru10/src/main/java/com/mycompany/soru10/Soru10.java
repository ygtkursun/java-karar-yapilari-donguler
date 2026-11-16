package com.mycompany.soru10;

import java.util.Scanner;

public class Soru10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        
        int secim = 0;
        
        while (secim != 5) {
            
            System.out.println(
                    "- 1: Bir sayinin karesini hesapla.\n" +
                    "- 2: Bir sayinin kupunu hesapla.\n" +
                    "- 3: Bir sayinin tek veya cift oldugunu kontrol et.\n" +
                    "- 4: Bir sayinin pozitif, negatif veya sifir oldugunu belirle.\n" +
                    "- 5: Programdan cik.");
            
            secim = input.nextInt();
            
            if (secim >= 1 && secim <= 4) {
                
                System.out.println("Sayi girin: ");
                number = input.nextInt();
                
            }
            
            switch (secim) {
                
                case 1:
                    
                    System.out.println(number * number);
                    
                    break;
                
                case 2:
                    
                    System.out.println(number * number * number);
                    
                    break;
                
                case 3:
                    
                    if (number % 2 == 0) {
                        
                        System.out.println("Sayi cifttir.");
                        
                    }
                    
                    else {
                        
                        System.out.println("Sayi tektir.");
                        
                    }
                    
                    break;
                    
                case 4:
                    
                    if (number > 0) {
                        
                        System.out.println("Sayi pozitiftir.");
                        
                    }
                    
                    else if (number < 0) {
                        
                        System.out.println("Sayi negatiftir.");
                        
                    }
                    
                    else {
                        
                        System.out.println("Sayi sifirdir.");
                        
                    }
                    
                    break;
                    
                case 5:
                    
                    System.out.println("Cikis yapildi.");
                    
                    break;
                    
                default:
                    System.out.println("Gecersiz secim!");
                
            }
            
        }
        
    }
}