package com.mycompany.soru5;

import java.util.Scanner;

public class Soru5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int number = input.nextInt();
        
        int basamak = 0;
        
        if (number == 0) {
            
            System.out.println("Basamak sayisi: 1" );
            
        }
        
        else {
            
            while (number != 0) {
            
            number = number / 10;
            
            basamak++;
            
            }
            
            System.out.println("Basamak sayisi: " + basamak);
            
        }
        
    }
}