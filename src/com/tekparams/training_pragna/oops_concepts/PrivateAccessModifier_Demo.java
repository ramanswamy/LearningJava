package com.tekparams.training_pragna.oops_concepts;

class accounts {
    int accNo;
    String name;
    double   balance;

    accounts(){             // Default constructor
        accNo=200;
        name="Raja";
        balance=50000.00;
    }
    accounts(int acNo,String na1, double b1){
        accNo=acNo;
        name=na1;
        balance=b1;
    }
    void updateAccountInfo(){
        accNo=300;
        name="Senthil";
        balance=30000.00;
    }
    void displayAccountInfo(){
        System.out.println("Account no. : "+accNo);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }


}

public class PrivateAccessModifier_Demo {
    private int amount=100;                     // private access modifier
    private void displayAmount(){
        System.out.println("The amount is :"+amount);
    }
    public static void main(String[] args){
        PrivateAccessModifier_Demo obj1=new PrivateAccessModifier_Demo();
        obj1.amount=200;
        obj1.displayAmount();

        accounts a1 = new accounts();           // No Arguments Constructor or Default Constructor
        a1.displayAccountInfo();
        a1.updateAccountInfo();
        a1.displayAccountInfo();

        accounts a2 = new accounts(400,"Vivek",45000.00);   // Parameterized constructor
        a2.displayAccountInfo();

        Animal al1 = new Animal();
        al1.weight=100;
        al1.height=80;
        al1.colour="Red";
        al1.displayAnimalInfo();




    }
}
