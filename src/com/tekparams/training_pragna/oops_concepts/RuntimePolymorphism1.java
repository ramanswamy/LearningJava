package com.tekparams.training_pragna.oops_concepts;
import com.tekparams.training_pragna.common.Bike;

public class RuntimePolymorphism1 extends Bike {
    public void run(){System.out.println("running safely with 60KM Speed");}
    public static void main(String[] args){
        Bike b = new RuntimePolymorphism1();
    }
}
