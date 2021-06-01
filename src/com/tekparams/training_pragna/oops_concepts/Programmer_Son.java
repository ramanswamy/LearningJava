package com.tekparams.training_pragna.oops_concepts;
import com.tekparams.training_pragna.oops_concepts.Programmer;


public class Programmer_Son extends Programmer{
    float salary_ps = 200000;
    //float totalSalary = 0;

    public static void main(String[] args){
        Programmer_Son ps = new Programmer_Son();
        ps.total=ps.salary_ps+ps.bonus+ps.hra+ps.others+ps.salary;
        ps.displaySalary();
    }

}
