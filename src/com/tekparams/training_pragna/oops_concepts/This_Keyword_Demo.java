package com.tekparams.training_pragna.oops_concepts;

class Invoices {
    String invoiceNo = "INV001";
    int invoiceAmount = 1000;

    Invoices (String invNo,int invAmt){
        this.invoiceNo=invNo;
        this.invoiceAmount=invAmt;
    }

    void printInvoice(){
        System.out.println("Invoice no. "+invoiceNo);
        System.out.println("Invoice amount. "+invoiceAmount);
    }
}


public class This_Keyword_Demo {
    public static void main(String[] args) {

        Invoices invObj = new Invoices("INV_002",7000);
        invObj.printInvoice();


    }
}
