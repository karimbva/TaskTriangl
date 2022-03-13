package com.company;

public class Triangl {
    int a;
    int b;
    int c;
    void area(){
       double p=(a+b+c)/2;
       double s=Math.sqrt((p-a)*(p-b)*(p-c));
        System.out.print("Площадь треугольника равна:  "+s);
    }
}
