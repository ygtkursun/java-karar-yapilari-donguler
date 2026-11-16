package com.mycompany.soru1;

import java.util.Scanner;

public class Soru1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int number = input.nextInt();
        
        for (int i = 1; i <= number; i++) {
            
            System.out.println(i);
            
        }
        
    }
}