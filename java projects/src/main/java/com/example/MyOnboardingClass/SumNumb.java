package com.example.MyOnboardingClass;

import java.util.Scanner;

public class SumNumb {
//    public static void main(Integer i, Integer j){
//        i=2;
//        j=3;
//        System.out.print(Integer.sum(i,j));
//    }
int sum(int a, int b) {
    return (a + b);
}

    public static void main(String args[]) {

        int a, b, s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();

        SumNumb dd = new SumNumb();
        s = dd.sum(a, b);

        System.out.println("Sum is:" + s);
    }
}
