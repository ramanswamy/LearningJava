package com.tekparams.training_pragna.erp;

public class Labeled_For_Loop {
    public static void main(String[] args){
        int i,j;
        aa:
        for (i=0;i<=3;i++)
        {
           bb:
           for(j=0;j<=3;j++)
           {
               if (i==2 && j==2)
               {
                   break aa;
               }
               System.out.println(i+">>>>>>>"+j);
           }
        }
    }
}
