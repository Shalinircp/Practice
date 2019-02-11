package inter;

import java.util.Arrays;

public class Anagram {

    public static void main(String... args){

        String str1="Cat";
        String str2="act";



            if (str1.length() == str2.length()) {
                char[] c1 = str1.toLowerCase().toCharArray();
                Arrays.sort(c1);
                char[] c2 = str2.toLowerCase().toCharArray();
                Arrays.sort(c2);

                if (Arrays.equals(c1, c2)) {
                    System.out.print("yes they are annagrams");
                }

            } else
                System.out.print("not annagrams");


    }

}