package com.tekparams.training_pragna.erp;

public class Switch_Demo_Byte {
    public static void main(String[] args)
    {
        byte n1;
        n1=0;
        switch(n1)
        {
            case 10:
                System.out.println("Ten...");
                break;
            case 20:
                System.out.println("Twenty...");
                break;
            case 30:
                System.out.println("Thirty...");
                break;
            default:
                System.out.println("No inputs fall in 10,20 and 30..");

        }
    }
}
