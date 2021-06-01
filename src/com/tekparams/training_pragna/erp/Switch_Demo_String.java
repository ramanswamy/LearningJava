package com.tekparams.training_pragna.erp;

public class Switch_Demo_String {
    public static void main(String[] args)
    {
        String levelString="Expert";
        int level=0;
        switch(levelString)
        {
            case "Beginner":
                System.out.println("Level 1");
                break;
            case "Intermediate":
                System.out.println("Level 2");
                break;
            case "Expert":
                System.out.println("Level 3");
                break;
            default:
            {
                System.out.println("Invalid input...");
            }

        }
    }
}
