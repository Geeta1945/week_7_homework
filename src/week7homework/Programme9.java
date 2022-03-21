package week7homework;
import java.util.Scanner;
import java.lang.*;
public class Programme9 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char ch,r;


        System.out.println("Please enter one alphabet from A to F : ");

        ch = obj.next().charAt(0);
        r=Character.toUpperCase(ch); // converting all input into uppercase to match with below switch statements cases

        switch(r){

            case 'A':

                System.out.println("Anand");
                break;

            case 'B':

                System.out.println("Bharuch");
                break;
            case 'C':

                System.out.println("Chatishgadh");
                break;
            case 'D':

                System.out.println("Dang");
                break;
            case 'E':

                System.out.println("Eluru");
                break;
            case 'F':

                System.out.println("Fatehgarh");
                break;
            default:

                System.out.println(" Invalid Entry ");


        }


    }
}
