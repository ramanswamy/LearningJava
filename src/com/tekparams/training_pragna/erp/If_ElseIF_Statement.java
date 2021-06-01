package com.tekparams.training_pragna.erp;

public class If_ElseIF_Statement {
    public static void main(String[] args){
        int marks=75;
        if (marks>=80)
        {
            System.out.println("Distinction!!");
        }
        else if (marks>=70 && marks<80)
        {
            System.out.println("First Class!!");
        }
        else if (marks>=50 && marks<70 )
        {
            System.out.println("Second Class !!");
        }
        else
        {
            System.out.println("Failed!!");
        }
    }
}
