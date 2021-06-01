package com.tekparams.training_pragna.erp;

public class Nested_If_Statement {
    public static void main(String[] args){
        int n1=0,n2=0,n3=0;
        n1=300;
        n2=500;
        n3=900;
        if (n1>n2)
        {
            if (n1>n3)
            {
              System.out.println("n1 is greater !!");
            }
            else
            {
                System.out.println("n3 is greater !!");
            }
        }
        else if (n2>n3)
        {
            System.out.println("n2 is greater!!");
        }
//        {
//            System.out.println("n3 is greater!!");
//        }
    }
}
