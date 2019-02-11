package inter;

public class Fact{

    public static void main(String... args){
        System.out.println("Printing factorial of a number");

        System.out.println("FActorial is "+ fact1(6));

    }

    private static int fact1(int n) {

        if( n<= 0)
            return 1;

        return n*fact1(n-1);
    }

}