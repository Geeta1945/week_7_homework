package week7homework;

import java.util.Scanner;

public class Programme2 {


    public static void main(String[] args) {
        int year, R;
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter year in YYYY format : ");

        year = obj.nextInt();
        R = year / 4;

        if (R == 0) {

            System.out.println("You have entered leap year");
        } else {
            System.out.println("You have NOT entered leap year");
        }


    }
}
