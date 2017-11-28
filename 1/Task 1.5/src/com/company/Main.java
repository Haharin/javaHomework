package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String login, password;
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Enter login : " );
        login = scanner.nextLine();
        System.out.print( "Enter password : " );
        password = scanner.nextLine();
        System.out.println(login);
        System.out.println(password.replaceAll(".","*"));
    }
}
