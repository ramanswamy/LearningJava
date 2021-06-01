package com.tekparams.training_pragna.oops_concepts;

import com.tekparams.training_pragna.customers.CustomerData;

class invoice extends CustomerData {
    static String invoiceNo = "INV001";    // Cannot be accessed from main function.
    int custInvoiceAmount = 10000;


}

public class Static_Keyword_Demo extends CustomerData {
    String invoiceNo="2021_1";      // Instance variable
    static String invoiceNo1="2020_1";      // Instance variable

    public static void main(String[] args){
        Static_Keyword_Demo obj = new Static_Keyword_Demo();
        obj.invoiceNo="2021_2";
        invoiceNo1 = "2020_2";

        invoice inv = new invoice();
        inv.custInvoiceAmount=100;
        invoice.invoiceNo ="INV002";    // Accessing class variable or static variable

    }
}
