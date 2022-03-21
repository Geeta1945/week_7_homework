package week7homework;
 import java.util.Scanner;

public class Programme13 {


    public static void main(String[] args) {

        System.out.println("Enter one no from 1 - 7 : ");

        Scanner obj =new Scanner(System.in);
        int input = obj.nextInt();

       if(input < 1 || input > 7) {
           do {

               System.out.println("Week contains 1 to 7 days : ");
               System.out.println("Enter one no from 1 - 7 : ");
               input = obj.nextInt();

           } while (input < 1 || input > 7);

       }

           else

           {
               switch (input) {

                   case 1:
                       System.out.println("Monday");
                       break;

                   case 2:
                       System.out.println("Tuesday");

                       break;

                   case 3 :
                       System.out.println("Wednesday");

                       break;
                   case 4:
                       System.out.println("Thursday");

                       break;

                   case 5 :
                       System.out.println("Friday");

                       break;

                   case 6:
                       System.out.println("Saturday");
                       break;

                   case 7:
                       System.out.println("Sunday");
                       break;


               }

           }


    }
}
