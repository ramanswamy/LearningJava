package com.tekparams.training_pragna.shapes;

public class Circle {
    double pi = 3.14;
    Operation op;
    double areaOftheCircle=area(10);

    double area(int radious){
        op=new Operation();

        int result=op.square(radious);
        return pi*result;
    }
    void displayAreaOftheCircle(){
        System.out.println("The area of the circle is : "+areaOftheCircle);
    }
    public static void main(String[] args){
        Circle cr = new Circle();
        cr.displayAreaOftheCircle();

    }
}
class Operation {

    int square(int n){
        return n*n;
    }
}

