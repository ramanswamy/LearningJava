package com.tekparams.training_pragna.erp;

public class Break_Example {

    public static void main(String[] args){
        int i,j;
        for (i=1;i<=10;i++){
            System.out.println(i);
            if (i==5){
                break;
            }
        }

        // Nested for loop
        for (i=1;i<=10;i++) {
            for (j=1;j<=10;j++){
                System.out.println(i+">>>>>"+j);
                if (i==5 && j==5){
                    break;
                }
            }
        }

    }

}
