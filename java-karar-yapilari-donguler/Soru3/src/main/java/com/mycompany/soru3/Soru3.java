package com.mycompany.soru3;

import java.util.Scanner;

public class Soru3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int number = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(number + " x " + i + " = " + (number * i));
            
        }
        
    }
}