package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int temp;
        for (int i = 0; i < 20; i++){
            temp  = rand.nextInt(99) + 1;
            System.out.print(temp + " ");
        }
        Random r = new Random();
        double rangeMin = 25, rangeMax = 75;
        for (int i = 0; i < 10; i++){
            System.out.println(rangeMin + (rangeMax - rangeMin) * rand.nextDouble());
        }
        String string = "Съешь ещё этих мягких французских булок, да выпей же чаю";
        for (char a:string.toCharArray()
             ) {
            System.out.print(a + " ");
        }
    }
}
