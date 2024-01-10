package programs;
import java.util.*;
public class AgeProgram {
    public static void main(String...args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter your age:");

int num=sc.nextInt();

System.out.println(age(num));




    }

private static String age(int age){

    if(age<18){

        return "invalid you are not eligible";
    }

    else{
        return "valid you are eligible";
    }




}
    
}
