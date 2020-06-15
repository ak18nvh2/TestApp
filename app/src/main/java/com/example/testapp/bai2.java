package com.example.testapp;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int soDien = 0;
        soDien=sc.nextInt();
        long giaTien=0, donGiaDuoi25=1000, donGiaDuoi75=1250, donGiaDuoi150=1800, donGiaTren150=2500 ;

        if( soDien > 0 && soDien <= 25) {
            giaTien=donGiaDuoi25*soDien;
        } else if(soDien <= 75){
            giaTien=donGiaDuoi25*25 + donGiaDuoi75*(soDien-25);
        } else if(soDien <= 150){
            giaTien=donGiaDuoi25*25 + donGiaDuoi75*50 + donGiaDuoi150*(soDien-75);
        } else {
            giaTien=donGiaDuoi25*25 + donGiaDuoi75*50 + donGiaDuoi150*75 + donGiaTren150*(soDien-150);
        }

        System.out.println("Tien phai tra: "+giaTien+"đ");


    }
}
