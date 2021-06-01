package com.tekparams.training_pragna.oops_concepts;

class Adder {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}

public class MethodOverloading1 {

    public static void main(String[] args){
        int c=0;
        int d=0;
        c=Adder.add(100,100);
        System.out.println("Method overloading with 2 params :"+c);
        d=Adder.add(200,100,40);
        System.out.println("Method overloading with 3 params :"+d);

    }
}
