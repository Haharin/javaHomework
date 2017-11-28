package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String first, second, temp, checked = "";
	Scanner scanner = new Scanner( System.in );
	System.out.print( "Enter first string : " );
	first = scanner.nextLine();
	System.out.println(first);
    System.out.print( "Enter second string : " );
    second = scanner.nextLine();
    if (first.contains(second)){
        System.out.print( "first contains second" );
    }
    else{
        for (char a: second.toCharArray()
             ) {
            temp = "" + a;
            if (first.contains(temp) && !checked.contains(temp)){
                System.out.println( temp + " - содержит" );
            }
            checked += temp;
        }
    }

    }
}
