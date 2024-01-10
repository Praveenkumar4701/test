package programs;

import java.util.Scanner;

public class MinArray {
    
    public static void main(String[]args){

  Scanner sc=new Scanner(System.in);
   System.out.println("enter the array length:");
int len=sc.nextInt();
   int ar[]=new int[len];
System.out.println("enter the  "+ len  +""+" elements:");

   for(int i=0;i<ar.length;i++){
    ar[i]=sc.nextInt();
   }

   int min=ar[0];


   for(int i=1;i<ar.length;i++){
     if(min>ar[i]){
        min=ar[i];
     }


   }
System.out.println("Minimum element of given array:"+min);
    
}
    
}
