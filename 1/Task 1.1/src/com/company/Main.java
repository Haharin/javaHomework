package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int summ = 0;
        for(int i = 0; i < 5; i++){
            System.out.print( "Enter int number : " );
            String intNumberString = scanner.nextLine();
            summ += Integer.parseInt( intNumberString );
        }
        System.out.print( "Summ of numbers : " + summ );
    }
}
