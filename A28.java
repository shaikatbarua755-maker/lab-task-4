import java.util.Scanner;


public class A28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,fact=1;
       System.out.println("Enter any number: ");
       number = input.nextInt();
       for (int i=number; i>=1; i-- ) {
        fact= fact * i;5
       }
       System.out.println("factorial of "+number+"=" +fact);
    }
}

