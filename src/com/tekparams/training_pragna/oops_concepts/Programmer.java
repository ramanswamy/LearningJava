package com.tekparams.training_pragna.oops_concepts;
import com.tekparams.training_pragna.employee.employee;

public class Programmer extends employee {
    protected float bonus = 50000;

    public static void main(String[] args){
        Programmer prog = new Programmer();

        prog.total=prog.hra+prog.others+prog.salary+prog.bonus;
        prog.displaySalary();




    }
}
