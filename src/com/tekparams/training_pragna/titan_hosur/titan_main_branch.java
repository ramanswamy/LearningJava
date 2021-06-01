package com.tekparams.training_pragna.titan_hosur;

public class titan_main_branch {
    protected int SonataWatches=1000;
    protected float TimexWatches=2000;
    protected void SalesApril(){
        System.out.println("Sonata watches sold : "+SonataWatches);
        System.out.println("Timex Watches sold : "+TimexWatches);
    }

    protected titan_main_branch(){
        SonataWatches=60;
        TimexWatches=100;
    }
    protected titan_main_branch(int s1,int t1){
        SonataWatches=s1;
        TimexWatches=t1;
    }
}
