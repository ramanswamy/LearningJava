package com.tekparams.training_pragna.erp;

public class ForEachExample {
    public static void main(String[] args){
        int amount[]={200,300,500,800};
        // For Each Loop
        for(int i:amount)
        {
            System.out.println(i);
        }
        // Simple For Loop
        for(int i=0;i<4;i++)
        {
            System.out.println(amount[i]);
        }
    }
}
