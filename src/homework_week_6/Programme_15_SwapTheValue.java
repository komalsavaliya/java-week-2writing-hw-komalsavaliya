package homework_week_6;

import java.util.Scanner;

/**
 *  Write a Java program to swap two variables.
 */

public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.print("Enter the secound variable value : ");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first, second);
        scanner.close();
    }
    //Swapping the value of variables
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before the swapping, The values of first variable id is :  " + a + " and second variable is : " + b);
    }
}

