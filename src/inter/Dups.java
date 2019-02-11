package inter;

public class Dups {

    public static void main(String... args) {
        System.out.println("Duplicates in an array");

        int[] arr={1,2,7,7,8,8,9,9};

        int i,j;
        System.out.println("duplicates are");
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1]) {

                System.out.print( arr[i]+"," );
            }

        }
    }

 }