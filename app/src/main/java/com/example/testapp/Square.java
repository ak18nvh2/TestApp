package com.example.testapp;

public class Square {
    private float mDoDaiCanh;

    public float getmDoDaiCanh() {
        return mDoDaiCanh;
    }

    public void setmDoDaiCanh(float mDoDaiCanh) {
        this.mDoDaiCanh = mDoDaiCanh;
    }


    void hienThiDoDai(){
        System.out.printf("Do dai canh la: %,.3f %n",this.mDoDaiCanh);
    }

    void  hienThiChuVi(){
        System.out.printf("Chu vi hinh vuong la: %,.3f%n",this.mDoDaiCanh*4);
    }

    void hienThiDienTich(){
        System.out.printf("Dien thich hinh vuong la: %,.3f%n",Math.pow(this.mDoDaiCanh,2));
    }

    void hienThiTatCa(){
        this.hienThiDoDai();
        this.hienThiChuVi();
        this.hienThiDienTich();
    }

}
