package com.tekparams.training_pragna.customers;

public class CustomerData {
    //static String custCity = "Bangalore";
    public String custCode = "C001";
    public String custName = "Ashok Leyland";
    public int custInvoiceAmount=5000;
    protected String custAddress = "Bangalore";

    public void displayCustData(){
        System.out.println("Cust Code : "+custCode);
        System.out.println("Cust Name : "+custName);
        System.out.println("Cust Invoice Amount : "+custInvoiceAmount);
    }

}
