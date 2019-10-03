package com.company;
import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        Random random = new Random();

        int countEven=0;
        int countOdd=0;
        int sumOfEven=0;
        int sumOfOdd=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a:");
        a = scan.nextInt();
        System.out.print("Input b:");
        b = scan.nextInt();
        if(a>b){
            a = a + b;
            b =a-b;
            a=a-b;
        }

        for(int i=0;i<40;i++){
            int randomInt=random.nextInt(b-a+1)+a;
            if(randomInt%2==0){
                countEven+=1;
                sumOfEven+=randomInt;

            }
            else{
                countOdd+=1;
                sumOfOdd+=randomInt;

            }
            System.out.printf("Random number %d between %d and %d\n ",randomInt,a,b);
        }
            if(sumOfOdd>sumOfEven){
                sumOfOdd=sumOfOdd+sumOfEven;
                sumOfEven=sumOfOdd-sumOfEven;
                sumOfOdd=sumOfOdd-sumOfEven;
            }

            for (int h =0;h<5;h++){
                int oddEvenRandom=random.nextInt(sumOfEven-sumOfOdd+1)+sumOfOdd;
                System.out.println("Random number between sum of odd and even numbers " +oddEvenRandom);
            }

            System.out.println("Amout of even numbers " +countEven);
            System.out.println("Amount of odd numbers " +countOdd);
            System.out.println("Sum of even numbers: " +sumOfEven);
            System.out.println("Sum of odd numbers " +sumOfOdd);





    }
}
