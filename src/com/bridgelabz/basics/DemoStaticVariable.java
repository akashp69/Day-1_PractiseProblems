package com.bridgelabz.basics;

public class DemoStaticVariable {
    static int StaticVar1;//Static Variable
    static void StaticVar2(){
        int x;//0
        StaticVar1=10;
        System.out.println(StaticVar1);
    }
    static void StaticVar3(){
        StaticVar1=20;

    }


    public static void main(String[] args) {
        int x=0;
        System.out.println(StaticVar1);//0
        System.out.println(x);//0
        StaticVar2();//10
        StaticVar3();//20
        System.out.println(StaticVar1);//20

    }
}
