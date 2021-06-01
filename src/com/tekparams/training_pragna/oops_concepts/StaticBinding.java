package com.tekparams.training_pragna.oops_concepts;


public class StaticBinding {
    private void eat(){
        System.out.println("Dog is eating....");
    }
    public static void main(String[] args)
    {
        StaticBinding d1 = new StaticBinding();
        d1.eat();
    }
}
