package inter;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase {

       public static void main(String ... args) {
           String str="This is a test";

           System.out.println(Stream.of(str.trim().split("\\s")).filter(s -> s.length()>0).map(s -> s.substring(0,1).toUpperCase()+s.substring(1)).collect(Collectors.joining(" "))) ;

           String[] arr=str.split("\\s");

           String result=" ";

           for(int i=0;i<arr.length;i++) {
             result+=  arr[i].substring(0,1).toUpperCase().concat(arr[i].substring(1).toLowerCase())+" ";


           }
           System.out.print("String is  : " + result.trim());
       }

}