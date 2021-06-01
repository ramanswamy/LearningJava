package com.tekparams.training_pragna.oops_concepts;

public class Animal {
    int weight, height;
    String colour;			// Data member (instance variable) declaration


    // Method definition
    public void walking()
    {
        System.out.println("Walking.....");
    }

    // Method definition
    public void running()
    {
        System.out.println("Running....");
    }

    void displayAnimalInfo(){
        System.out.println("Weight : "+weight);
        System.out.println("Height : "+height);
        System.out.println("Colour : "+colour);

    }

    public static void main(String[] args) {

        Animal obj1 = new Animal();			// Animal() is the default constructor.
        obj1.weight=100;
        obj1.height=5;
        System.out.println("The weight is............"+obj1.weight);
        System.out.println("The height is............"+obj1.height);
        obj1.running();
        obj1.walking();

    }
}
