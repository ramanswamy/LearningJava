package com.tekparams.training_pragna.oops_concepts;
import com.tekparams.training_pragna.common.Animal1;
import com.tekparams.training_pragna.common.Animal1.*;

class Dog extends Animal1 {
    String colour = "black";

    void printColour() {
        System.out.println(super.colour);
    }
}


public class Super_Keyword_Demo extends Animal1 {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(d.colour);
        d.printColour();

    }
}
