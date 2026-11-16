package com.mycompany.soru7;

import java.util.Scanner;

public class Soru7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int number = input.nextInt();
        
        int asal = 1;
        
        if (number <= 1) {
            
            asal = 0;
            
        }
        
        else {
            
            for (int i = 2; i < number; i++) {
                
                if (number % i == 0) {
                    
                    asal = 0;
                    
                    break;
                    
                }
                
            }
            
        }
        
        if (asal == 0) {
            
            System.out.println("Sayi asal degildir.");
            
        }
        
        else {
            
            System.out.println("Sayi asaldir.");
            
        }
        
    }
}