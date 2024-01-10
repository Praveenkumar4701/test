package programs;

import java.util.Scanner;

public class SecondMaxArray {
     public static void main(String[]args){

  Scanner sc=new Scanner(System.in);
   System.out.println("enter the array length:");
int len=sc.nextInt();
   int ar[]=new int[len];
System.out.println("enter the  "+ len  +""+" elements:");

   for(int i=0;i<ar.length;i++){
    ar[i]=sc.nextInt();
   }

   int max=0;
   int secondmax=0;


   for(int i=0;i<ar.length;i++){
      if(ar[i]>max){
         secondmax=max;
         max=ar[i];
        
      }
      else if(ar[i]>secondmax){

        secondmax=ar[i];
      }


   }
System.out.println("Maximum element of given array:"+max);
System.out.println("secondmaximum element of given array:"+secondmax);
    

    
}
}
