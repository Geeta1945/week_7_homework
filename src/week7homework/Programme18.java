package week7homework;

public class Programme18 {

    public static void main(String[] args) {

        int ar[] = {10, 12, 15, 80, 30, 91};
        int sum ;
        sum =0;

//advanced for loop
        for (int i:ar) {

            sum = sum + i;

        }

        System.out.println("Total of array is : " + sum);
    }
}

