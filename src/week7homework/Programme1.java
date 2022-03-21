package week7homework;

import java.util.Scanner;

public class Programme1 {


    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);


        int remainder;
        System.out.print("Please enter number : ");
        int a= obj.nextInt();

        remainder = a/2;

        if (remainder == 0) {
            System.out.println("You have entered Even Number");
        }

            else
            {
                System.out.println("You have entered Odd number");


            }
        }

    }

