import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(" Please enter number of fibanocci");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();


        for (int i=0 ;i<=n;i++) {

            System.out.print(" " + Main.fibnocci(i));
        }
    }

   static int fibnocci(int n){


       if (n<2) {

           return n;
       }

       return fibnocci(n-1)+fibnocci(n-2);
   }

  }
