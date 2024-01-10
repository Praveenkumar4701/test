package programs;

import java.util.Scanner;

public class Calculator {

    public static void main(String...args){

        Scanner scanner=new Scanner(System.in);
        int num1,num2;
        String op;


        System.out.println("Enter the first number");
        num1=scanner.nextInt();
        System.out.println("Enter he second number");
        num2=scanner.nextInt();
        System.out.println("enter the operator");
        op=scanner.next();

        switch(op){

            case "+":
            System.out.println("addition is:"+(num1+num2));
            break;

            case "-":
            System.out.println("subtracton is"+(num1-num2));
            break;

            case "*":
            System.out.println("multiplication is:"+(num1*num2));
            break;

            case "/":
            System.out.println("division is:"+(num1/num2));
            break;

            case "%":

            System.out.println("remainder is:"+(num1%num2));
            break;

            default:
            System.out.println("enter the valid operator");




        }


    }
    
}
