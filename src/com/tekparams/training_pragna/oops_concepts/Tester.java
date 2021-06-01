package com.tekparams.training_pragna.oops_concepts;
import com.tekparams.training_pragna.employee.employee;

public class Tester extends employee {
    float incentives = 100000;

    public static void main(String[] args){
        Tester ts = new Tester();
        ts.total=ts.hra+ts.salary+ts.others+ts.incentives;
        ts.displaySalary();
    }
}
