package week7homework;
import java.util.Arrays;
public class Programme17 {

    public static void main(String[] args) {
        String[] fruits = {"apple","banana","chiku","dadam","appricot","blueberry","orange"};
        int[] number = {10,22,50,19,98,76,85,1,25};
        System.out.println("Original Numeric Array : "+ Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Sorted Numeric Array :"+ Arrays.toString(number));

        System.out.println("Original string Array :"+Arrays.toString(fruits));
        Arrays.sort(fruits);

        System.out.println("Sorted String Array :"+Arrays.toString(fruits));


    }
}



