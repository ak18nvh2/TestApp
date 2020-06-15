package com.example.testapp;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Square x= new Square();
        x.setmDoDaiCanh(sc.nextFloat());
        x.hienThiDoDai();
        x.hienThiChuVi();
        x.hienThiDienTich();
        x.hienThiTatCa();
    }
}
