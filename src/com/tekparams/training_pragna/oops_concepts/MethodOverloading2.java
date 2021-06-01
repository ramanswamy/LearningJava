package com.tekparams.training_pragna.oops_concepts;

class Adder1 {
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading2 {

    public static void main(String[] args){
        int c=0;
        double d=0;
        c=Adder1.add(100,100);
        System.out.println("Method overloading with 2 params :"+c);
        d=Adder1.add(200.50,100.30);
        System.out.println("Method overloading with change in data type :"+d);

    }
}
