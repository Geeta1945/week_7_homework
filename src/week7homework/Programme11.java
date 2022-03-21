package week7homework;

public class Programme11 {


    public static void main(String[] args) {
        int[] a = new int[100];
        int unique;

        System.out.println("divided by 3 :");

        for (int i = 1; i < 100; i++) {

            if (i % 3 == 0) {
                System.out.print(i+",");


            }
        }
        System.out.println("   ");


        System.out.println("divided by 5 :");

        for (int i = 1; i < 100; i++) {

            if (i % 5== 0) {
                System.out.print(i+",");


            }
        }

        System.out.println("\nThese numbers can be divided by 3 AND 5:");

        for (int j = 1; j < 100; j++) {

            if (j % 3 == 0 && j % 5 == 0) {
                System.out.print(j+",");


            }
        }

    }
}
    //System.out.println("\n divided by 5 :");



