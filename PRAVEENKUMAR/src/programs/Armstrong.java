package programs;

import java.util.Scanner;



public class Armstrong {


    public static void main(String...args){
        int first=0,second=1,third;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the armstrong number");
        int n=sc.nextInt();
        System.out.println("armstrong numbers are");
        for(int i=1;i<=1;i++){
  System.out.println(first);
  System.out.println(second);
        }
      
        
        for(int i=0;i<n;i++){
            third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }



    }
    
}
