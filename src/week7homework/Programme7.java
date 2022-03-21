package week7homework;
import java.util.Scanner;

public class Programme7 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
       int sales_id;
       String name;
       double sales,salary,commission =0;

        System.out.print("Please enter sales ID : ");
        sales_id = obj.nextInt();
        System.out.println("Please enter name : ");
        name = obj.next();
        System.out.println("Please enter sales amount : ");
        sales = obj.nextDouble();
        System.out.println("Please enter salary : ");
        salary = obj.nextDouble();

        if (sales>=50000) {

            commission = sales * 0.35;
        }
            else if(sales>=30000){
                commission = sales*0.20;

        }
        else if(sales>=20000){
            commission = sales*0.10;

        }
        else if(sales>=10000){
            commission = sales*0.5;

        }
        else if(sales>=1000){
            commission = sales*0.2;

        }

        System.out.println(name + " "+sales_id + " £"+commission + " "+ "Commission received");



    }


}
