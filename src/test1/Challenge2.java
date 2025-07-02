package test1;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Addition; "+num1+num2);
        System.out.println("Subtraction; "+(num1-num2));
        System.out.println("Multiplication; "+(num1*num2));
        System.out.println("Division; "+(num1/num2));
        System.out.println("Modulus; "+(num1|num2));
    }
}
