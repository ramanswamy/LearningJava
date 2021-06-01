package com.tekparams.training_pragna.oops_concepts;
import com.tekparams.training_pragna.titan_hosur.titan_main_branch;
import com.tekparams.training_pragna.titan_hosur.titan_main_branch.*;

class titan_bangalore extends titan_main_branch {
    int SonataWatches1=400;
    int TimexWatches1=200;
    void SalesAprilBlr(){
        System.out.println("Sonata watches sold : "+SonataWatches1);
        System.out.println("Timex Watches sold : "+TimexWatches1);
    }
}

public class ProtectedAccessModifier_Demo extends titan_main_branch{
    int SonataWatches1=400;
    int TimexWatches1=200;
    void SalesAprilBlr(){
        System.out.println("Sonata watches sold : "+SonataWatches1);
        System.out.println("Timex Watches sold : "+TimexWatches1);
    }

    public static void main(String[] args) {
        titan_bangalore obj = new titan_bangalore();
        ProtectedAccessModifier_Demo obj1 = new ProtectedAccessModifier_Demo();
        obj1.SalesApril();
        obj1.SonataWatches=100;
        obj1.TimexWatches=20;
        obj1.SalesApril();
    }
}
