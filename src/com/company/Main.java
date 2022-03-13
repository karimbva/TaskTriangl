package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangl triangl=new Triangl();
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите сторону а: ");
        triangl.a= scan.nextInt();
        System.out.println("Введите сторону b: ");
        triangl.b= scan.nextInt();
        System.out.println("Введите сторону c: ");
        triangl.c= scan.nextInt();
       triangl.area();

    }
}
