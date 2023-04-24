import  java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);

        double bill = sc.nextDouble();
        double tip = bill * 0.15;

        System.out.println(tip);
    }
}

/*You always tip 15% of the bill amount. 
To make the calculation easier, you decide to write a program that will do that for you.
Take the bill amount as input and output the corresponding tip amount, which should be 15% of the amount.
*/
