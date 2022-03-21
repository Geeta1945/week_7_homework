package week7homework;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;
public class Programme20 {

    public static void main(String[] args) {
        int no;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter one number : ");

        no =obj.nextInt();

        boolean b =false;

        int a [] ={10,20,14,80,55,35};

        for(int i=0;i<a.length;i++){

            //System.out.println(a[i]);

            if (no == a[i]) {
                b=true;

                break;// once we find the match we would like to exit the for loop or break it.
            }
            else{
                b=false;

            }

        }

        if (b)
        {
            System.out.println(b);
            System.out.println("Number exist in array");
        }

        else
        {
            System.out.println("number doesn't exist in array");

        }

    }
}
