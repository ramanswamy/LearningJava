package com.tekparams.training_pragna.oops_concepts;
import com.tekparams.training_pragna.address.Address;


class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public void displayEmployee(){
        System.out.println("Emp ID:"+id);
        System.out.println("Emp Name:"+name);
        System.out.println("Address :"+address.city+"\n"+address.state+"\n"+address.country);
    }
}


public class Aggregation {
    public static void main(String[] args){
        Address address1 = new Address("Bangalore","Karnataka","India");
        Address address2 = new Address("Mumbai","Maharashtra","India");

        Emp emp1 = new Emp(100,"Suresh",address1);
        Emp emp2 = new Emp(101,"Karthik",address2);

        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
