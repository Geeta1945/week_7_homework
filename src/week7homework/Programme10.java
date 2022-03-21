package week7homework;

import java.util.Scanner;

public class Programme10 {

    static char operator;
    static double num1, num2;// static variables created

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// object created for Scanner class to allow user to enter the numbers and operator
        Programme10 transfer = new Programme10();// object created for Programme10


        System.out.print("Enter first number : ");
        num1 = input.nextDouble();
        System.out.print("Enter second number : ");
        num2 = input.nextDouble();
        System.out.print("Enter the operator : ( +,-,*,/ ) : ");

        operator = input.next().charAt(0);//input.next() method has been used to extract string value entered by user for operator
        // charAt(0) will provide first character from input.next() and which can be compared in below switch  statement

        if (operator == '+'){

            System.out.println("The addition is : "+(num1+num2));
        }

         else if(operator == '-'){

            System.out.println("The subtraction is : "+(num1-num2));
        }
        else if(operator == '*'){

            System.out.println("The multiplication is : "+(num1*num2));
        }
        else if(operator == '/'){

            System.out.println("The division is : "+(num1/num2));
        }

    }
}