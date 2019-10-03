package com.company;

import java.util.Scanner;

public class B extends A{
    public int y;

    public void yReader(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input y:");
        y = scan.nextInt();
    }

    public void addXtoY(){
        System.out.println(readerA()+y);
    }
}
