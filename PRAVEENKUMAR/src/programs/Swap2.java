package programs;

import java.util.Scanner;

public class Swap2 {

    public static void main(String...args)
{
    
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        swap(a,b);
}

static void swap(int a,int b){

    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a value is: "+a +" "+"b value is: "+b);



}
    
}
