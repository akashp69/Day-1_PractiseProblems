package com.bridgelabz.basics;

public class StringEqualOrNot{
    static void stringExample(){
        String a="Akash";
        String b="akash";
        System.out.println(a.equals(b));//False (a Not Equal to b)
        System.out.println(b.equals(a));//False (b Not Equal to a)
    }
    public static void main(String[] args){
        System.out.println("Checking Two Strings Are Equal or Not Equal");
        stringExample();//method calling
    }
}
