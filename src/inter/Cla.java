package inter;

public class Cla {

    public static void main(String... args){
        System.out.println(" Reversing the string by removing vowels and finding the length");
        String str="gooblers";
        StringBuffer sb=new StringBuffer(str.replaceAll("[aeiouAEIOU]",""));
        sb.reverse();
        if(sb.length()%2==0)
            System.out.println("String is"+ sb+"length is even");

        System.out.println("String is  :"+ sb +" length is odd");


    }

}