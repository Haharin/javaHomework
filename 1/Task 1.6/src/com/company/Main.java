package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {
//        ArrayList<String > stringList = new ArrayList<String>();
//        //String [] stringArr = new String[5];
//        Scanner scanner = new Scanner( System.in );
//        for (int i = 0; i < 5; i++){
//            System.out.print( "Enter login : " );
//            stringList.add(scanner.nextLine();
//        }
//    System.out.println(stringList.);
//    stringList.sort();
//    System.out.println(stringArr);








    public static void main(String[] args) {
        Comparator<String> stringLengthComparator = new StringLengthSort();
        Scanner scanner = new Scanner( System.in );
        String[] array = new String[5];

        for (int i = 0; i < 5; i++){
            array[i] = scanner.nextLine();
        }
        Arrays.sort(array, stringLengthComparator);
        for (int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }
    }
}
