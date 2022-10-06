package com.bridgelabz.basics;

public class SumOfCommandLineArgs{
    public static void main(String[] args) {
        System.out.println(args [0]);
        System.out.println(args [1]);

        int X = Integer.parseInt(args [0]);//10
        int Y = Integer.parseInt(args [1]);//20

        int Sum = (X+Y);//10+20
        System.out.println(Sum);//30

    }
}
