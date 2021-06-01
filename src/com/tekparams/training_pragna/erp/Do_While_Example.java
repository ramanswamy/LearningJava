package com.tekparams.training_pragna.erp;

public class Do_While_Example {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        int amount[]={33,66,44,88,99};
        int ctr=0;

        do
        {
            System.out.println(i);
            sum=sum+i;
            i++;
        }while(i<=10);

        System.out.println("Sum is : "+sum);

        // Use while for printing amount
        do
        {
            System.out.println("Amount("+ctr+")"+">>>>>"+amount[ctr]);
            ctr=ctr+1;
        }
        while(ctr<5);

    }
}
