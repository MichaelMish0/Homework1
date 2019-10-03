package com.company;

import java.util.Scanner;

public class A {
    public A(){
        System.out.println("Hello");
    }
    public int x;

    public int readerA(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x:");
        x = scan.nextInt();
        return x;
    }

    public void additionX(){
        System.out.println(x+12);
    }

    public void oddOrEven(){
        if(x%2==0){
            System.out.println("X is even");
        }
        else{
            System.out.println("X is odd");
        }
    }
}
