package com.tekparams.training_pragna.oops_concepts;

abstract class Bike2 {
    abstract void run();
}

class AbstractClassDemo extends Bike2{
    void run() {System.out.println("running safely");}

        public static void main(String[] args){
            Bike2 b2 = new AbstractClassDemo();
            b2.run();
        }
}
