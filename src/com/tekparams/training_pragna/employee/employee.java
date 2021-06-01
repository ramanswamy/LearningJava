package com.tekparams.training_pragna.employee;

public class employee {
    protected float salary = 40000;
    protected float hra = 20000;
    protected float others = 20000;
    protected float total = 0;

    protected void calculateSalary(){
        this.total=this.salary+this.hra+this.others;
    }
    protected void displaySalary(){
        System.out.println(this.total);
    }
}
