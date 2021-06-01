package com.tekparams.training_pragna.oops_concepts;

import com.tekparams.training_pragna.common.Animal2;

class Dog2 extends Animal2 {
    public void eat2() {
        System.out.println("dog is eating");
    }

}

public class DynamicBinding {
    public static void main(String[] args){
        Animal2 a2 = new Dog2();  // upcast
        a2.eat2();
    }


}
