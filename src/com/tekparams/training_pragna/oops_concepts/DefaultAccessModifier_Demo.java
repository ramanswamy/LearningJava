package com.tekparams.training_pragna.oops_concepts;

class Student {
    String regNo="R001";
    String name="Vivek";

    void displayStudent(){
        System.out.println(regNo+"\n"+name);
    }
    Student(){
       regNo="R001_1";
       name="Senthil";
    }
    Student(String pregNo,String pname){
        regNo=pregNo;
        name=pname;
    }
}

class Marks{
    int marks;                          // Default access modifier

    void displayMarks(){                // Default access modifier
        System.out.println(marks);
    }
}

public class DefaultAccessModifier_Demo {
    int amount =100;                // Default access modifier

    void display(){                 // Default access modifier
        System.out.println("The amount is : "+amount);
    }

    public static void main(String[] args){
        DefaultAccessModifier_Demo obj1 = new DefaultAccessModifier_Demo();

        Student s1 = new Student();                                 // Default Constructor
        Student s2 = new Student("R100","Ravi");    // Parameterized Constructor
        Marks m1 = new Marks();
        obj1.amount=200;
        obj1.display();
        s1.displayStudent();
        s1.regNo="R002";
        s1.name="Raja";
        s1.displayStudent();
        m1.marks=100;
        m1.displayMarks();
        s2.displayStudent();

        Animal a1 = new Animal();
        a1.weight=100;
        a1.colour="Brown";
        a1.displayAnimalInfo();

    }
}
