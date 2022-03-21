package week7homework;
import java.util.Scanner;
public class Programme8 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        char ch;

            System.out.println("Please enter one alphabet from A to F : ");

            ch = obj.next().charAt(0);


        if (ch == 'A' || ch == 'a') {

            System.out.println("Anand");
        }
        else if (ch == 'B' || ch == 'b')
        {

            System.out.println("Bharuch");

        }
        else if (ch == 'C' || ch == 'c')
        {

            System.out.println("Chatishgadh");

        }
        else if (ch == 'D'|| ch == 'd')
        {

            System.out.println("Dang");

        } else if (ch == 'E' || ch == 'e') {

            System.out.println("Eluru");

        } else if (ch == 'F' || ch == 'f') {

            System.out.println("Fatehgarh");

        }

        else

        System.out.println("Invalid entry ");
    }
}






