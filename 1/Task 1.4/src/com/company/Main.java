package com.company;

        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Random rand = new Random();
        System.out.print( "Enter [a; b] " );

        String str = scanner.nextLine();
        str = str.replace("[", " ");
        str = str.replace("]", " ");
        str = str.trim();
        int[] numAB = Arrays.stream(str.split(";")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < 10; i++){
            System.out.println(numAB[0] + rand.nextInt((numAB[1] - numAB[0] + 1)));
        }
    }
}
