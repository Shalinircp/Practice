package inter;

import java.util.Arrays;

public class LarSmall {

    public static void main(String ... args) {
        System.out.println(" Program to print large and small numbers in an array");
        int[] arr={1,5,8,9,4,3,3,9,10,12,13,13,8,8};
        int large=Arrays.stream(arr).max().getAsInt();
        int small=Arrays.stream(arr).min().getAsInt();

        System.out.println("Large number is"+ large);
        System.out.println("Smallest number is"+ small);

        Arrays.stream(arr).distinct().forEach(System.out::println);

    }
}