package com.example.testapp;

import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<News> arr= new ArrayList<>();
        int x=0;
        while (x!=4){
            System.out.println("===============================================");
            System.out.println("1 - Insert news");
            System.out.println("2 - View list news");
            System.out.println("3 - Average rate");
            System.out.println("4 - Exit");
            System.out.println();
            System.out.print("Nhap lua chon: ");

            x=sc.nextInt();
            sc.nextLine();

            if(x==1){
                News a= new News();
                System.out.print("Title: ");
                a.setmTitle(sc.nextLine());
                System.out.print("PublishDate: ");
                a.setmPublishDate(sc.nextLine());
                System.out.print("Author: ");
                a.setmAuthor(sc.nextLine());
                System.out.print("Content: ");
                a.setmContent(sc.nextLine());
                System.out.print("Rate list ( 3 rates ): ");
                int [] rateList= new int [3];
                for(int i=0;i<3;i++)
                    rateList[i]=sc.nextInt();
                a.setRateList(rateList);
                arr.add(a);

            } else if(x==2){
                for ( News a: arr) {
                    a.display();
                }

            } else if(x==3){
                for (News a: arr ) {
                    a.calculate();
                    a.display();
                }
            }
        }
    }
}
