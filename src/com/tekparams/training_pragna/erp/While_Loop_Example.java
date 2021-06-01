package com.tekparams.training_pragna.erp;

public class While_Loop_Example {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        int amount[]={33,66,44,88,99};
        int ctr=0;
        while(i<=10)
        {
            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is : "+sum);
        // Use while for printing amount
        while(ctr<5)
        {
            System.out.println("Amount("+ctr+")"+">>>>>"+amount[ctr]);
            ctr=ctr+1;
        }

    }
}
