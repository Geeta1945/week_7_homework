package week7homework;

import java.util.Scanner;

public class Programme4 {

    static boolean result = true;
    static boolean result1 = false;
    static int i;

    public static void main(String[] args) {
        //Scanner obj = new Scanner(System.in);
        //System.out.print("Enter year in yyyy format : ");
       // isLeapYear(obj.nextInt());

        System.out.println("           ");
        isLeapYear(1600);



        getDaysMonth(1, 2025);

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999)
        {
            if (year % 4 == 0 || year % 400 == 0)
            {

                System.out.println("Leap Year." + year);
                return result;
            } else
            {

                System.out.println("Not a leap year " + year);
                return result1;
            }
        } else if (year < 1 || year > 9999)
        {


            System.out.println("You have entered wrong year");
            return result1;

        }
        return result1;
    }








    public static int getDaysMonth(int month, int year) {

        boolean r;

        if (month < 1 || month > 12 ||year <1 || year >9999) {
            System.out.println("You have entered wrong month or year : " + "Month : "+month+" Year : " + year);

            return -1;


        } else {

            r = isLeapYear(year);
            if (r == true && month == 2) {

                System.out.println("Days of February is 29" +" and "+ year + " is leap year");
            } else if(r == true && month != 2 || r==false && month!=2 ) {

                    switch (month) {

                        case 1:

                            System.out.println("Days of January is 31. ");
                            break;

                        case 3:
                            System.out.println("Days of March is 31. ");

                            break;

                        case 4:
                            System.out.println("Days of April is 30. ");
                            break;
                        case 5:

                            System.out.println("Days of May is 31. ");
                            break;

                        case 6:

                            System.out.println("Days of Jun is 30. ");
                            break;

                        case 7:

                            System.out.println("Days of July is 31. ");
                            break;

                        case 8:

                            System.out.println("Days of August is 31. ");
                            break;

                        case 9:

                            System.out.println("Days of September is 30. ");
                            break;
                        case 10:

                            System.out.println("Days of October is 31. ");
                            break;

                        case 11:

                            System.out.println("Days of November is 30. ");
                            break;
                        case 12:

                            System.out.println("Days of December is 31. ");
                            break;

                    }

                } else {

                System.out.println("Entered year is not leap year " + year);
                System.out.println("There are 28 days in February.");



                }
            }



return 1;
    }


    }





