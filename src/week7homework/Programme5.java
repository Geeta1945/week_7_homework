package week7homework;

import java.util.Scanner;
import java.io.*;

public class Programme5 {

    public static void main(String[] args) {
        int id;
        double hra, ta, da, pf, gross_salary, salary;
        String name;


        Scanner obj = new Scanner(System.in);

        System.out.println("Enter employee ID : ");
        id = obj.nextInt();
        System.out.println("Enter employee name : ");
        name = obj.next();

        System.out.println("Enter basic salary : ");
        salary = obj.nextDouble();

        System.out.println(id + name + salary);
        hra = salary * 0.1;
        da = salary * 0.8;
        ta = salary * 0.9;
        pf = salary * 0.2;
        gross_salary = salary + hra + da + ta - pf;
        System.out.println(gross_salary);

        System.out.println("_________________________________________\n"+
                "|                Salary Slip            |\n" +
      "|_______________________________________|\n" +
                "|                                       |\n" +
                "|  Employee ID      :" + id + "                 |\n" +
                "|  Employee Name    :" + name + "                |\n" +
         "|_______________________________________|\n"+
                "|  Basic Salary     :" + salary + "            |\n"+
        "|  HRA 10%          :" + hra + "             |\n" +
                "|  TA 8%            :" + ta + "            |\n" +
                "|  DA 9%            :" + da + "             |\n" +
                "|  PF - 20&         :" + pf + "             |\n" +
                "|                                       |\n" +
                "|_______________________________________|\n" +
                "|  Gross Salary     :" + gross_salary + "            |\n" +
                "|=======================================|");

    }


}

