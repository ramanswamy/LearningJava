package com.tekparams.training_pragna.erp;

public class Switch_Demo_Nested_Switch {
    public static void main(String[] args)
    {
        {
            //C - CSE, E - ECE, M - Mechanical
            char branch = 'C';
            int collegeYear = 4;
            switch( collegeYear )
            {
                case 1:
                    System.out.println("English, Maths, Science");
                    break;
                case 2:
                    switch( branch )
                    {
                        case 'C':
                            System.out.println("Operating System, Java, Data Structure");
                            break;
                        case 'E':
                            System.out.println("Micro processors, Logic switching theory");
                            break;
                        case 'M':
                            System.out.println("Drawing, Manufacturing Machines");
                            break;
                    }
                    break;
                case 4:
                    switch( branch )
                    {
                        case 'C':
                            System.out.println("Data Communication and Networks, MultiMedia");
                            break;
                        case 'E':
                            System.out.println("Embedded System, Image Processing");
                            break;
                        case 'M':
                            System.out.println("Production Technology, Thermal Engineering");
                            break;
                    }
                    break;
            }
        }
    }
}
