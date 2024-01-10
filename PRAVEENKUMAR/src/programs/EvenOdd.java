package programs;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
System.out.println("enter the integer");
        int n=sc.nextInt();
       if(n%2==0){
        System.out.println(n+ " it is even number");
       }
       else{
        System.out.println(n+ " it is odd number");
       }
       

        }

    }
    

