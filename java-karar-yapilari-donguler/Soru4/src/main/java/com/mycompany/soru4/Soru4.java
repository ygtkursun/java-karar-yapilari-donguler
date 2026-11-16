package com.mycompany.soru4;

import java.util.Scanner;

public class Soru4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int number = input.nextInt();
        
        int faktoriyel = 1;
        
        if (number < 0) {
            
            System.out.println("Gecersiz sayi!");
            
        }
        
        else {
            
            for (int i = 1; i <= number; i++) {
            
                faktoriyel = faktoriyel * i;
            
            }
        
        System.out.println(number + "! = " + faktoriyel);
        
        }
    }
}