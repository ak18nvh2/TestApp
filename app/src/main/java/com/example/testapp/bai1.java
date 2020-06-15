package com.example.testapp;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double delta= b*b-4*a*c;
        System.out.println("delta="+delta);

    }
}
