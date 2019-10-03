package com.company;

import java.util.Scanner;

public class C {

    public int a;
    public int b;
    public int c;

    public void reader(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a:");
        a = scan.nextInt();
        System.out.print("Input b:");
        b = scan.nextInt();
        System.out.print("Input c:");
        c = scan.nextInt();
    }

    public int lastDigit(){
        return(a%10);
    }

    public int firstDigit(){
        while(b>=10)
            b/=10;
        return b;
    }

    public int sumOfDigits(){
        int sum =0;
        while(c !=0){
            sum = sum + c %10;
            c=c/10;
        }
        return sum;
    }

    public int multiplyOf2n3(){
        return lastDigit()*firstDigit();
    }

    public int sumOf3n5(){
        return firstDigit()+multiplyOf2n3();
    }
}
