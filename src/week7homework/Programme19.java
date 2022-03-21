package week7homework;

public class Programme19 {
    public static void main(String[] args) {

        int ary[] = {10, 20, 20, 80, 60, 100};
        int total;
        int avrg;
        total=0;

//advanced for loop
        for (int i:ary) {

            total = total+ i;

        }

        avrg = total/6;

        System.out.println("Average of array is : " + avrg);
    }


}
