package com.tekparams.training_pragna.erp;

public class Continue_Example {
    public static void main(String[] args){
        int i,j;
        for (i=1;i<=10;i++){

            if (i==5){
                continue;
            }
            System.out.println(i);
        }

        // Nested for loop
        for (i=1;i<=10;i++) {
            for (j=1;j<=10;j++){

                if (i==5 && j==5){
                    continue;
                }
                System.out.println(i+">>>>>"+j);
            }
        }
    }
}
