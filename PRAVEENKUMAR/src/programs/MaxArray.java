package programs;

import java.util.Scanner;

public class MaxArray {

    
    public static void main(String[]args){

  Scanner sc=new Scanner(System.in);
   System.out.println("enter the array length:");
int len=sc.nextInt();
   int ar[]=new int[len];
System.out.println("enter the  "+ len  +""+" elements:");

   for(int i=0;i<ar.length;i++){
    ar[i]=sc.nextInt();
   }

   int max=ar[0];


   for(int i=1;i<ar.length;i++){
      if(max<ar[i]){
         max=ar[i];
      }


   }
System.out.println("Maximum element of given array:"+max);
    
}
}
