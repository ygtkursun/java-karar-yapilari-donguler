package com.mycompany.soru6;

import java.util.Scanner;

public class Soru6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int number = input.nextInt();
        
        int number2 = 0;
        
        while (number != 0) {
            
            int son = number % 10;
            
            number2 = number2 * 10 + son;
            
            number = number / 10;
            
        }
        
        System.out.println("Sayinin tersi: " + number2);
        
    }
}