package week7homework;

import java.util.Scanner;
public class Programme16 {

    public static void main(String[] args) {
        int number;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter one number : ");
        number = obj.nextInt();

        if (number ==0) {

            System.out.println("Zero");
        }

            else if(number <0){

            System.out.println("Negative");

        }

            else {


            System.out.println("Positive");
        }




    }
}
