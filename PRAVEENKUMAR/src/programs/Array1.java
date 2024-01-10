package programs;
import java.util.*;
public class Array1 {
    public static void main(String[]args){

  Scanner sc=new Scanner(System.in);
   System.out.println("enter the array length:");
int len=sc.nextInt();
   int ar[]=new int[len];
System.out.println("enter the  "+ len  +""+" elements:");

   for(int i=0;i<ar.length;i++){
    ar[i]=sc.nextInt();
   }

   System.out.println("array elements are:");
   for(int i=0;i<ar.length;i++){
    System.out.println(ar[i]);
   }



    }
    
}
