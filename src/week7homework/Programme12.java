package week7homework;

import java.util.Scanner;

public class Programme12 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char c = obj.next().charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) // we are checking entered value is character or not
        {
            System.out.println(c + " is a alphabet");// checking entered value is number or not
        } else if (c >= 0 && c <= 9) {

            System.out.println(c + " is a digit");
        }
        else
        {
            System.out.println(c+" is a special character.");
        }
    }
}
