package programs;

import java.util.Scanner;

public class SwitchCaseProgram {

    public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("enter your grade");
String mark=sc.next();



switch(mark){

    case "A":
    System.out.println("you got A grade");
break;
    case "B":
    System.out.println("you got B grade");
    break;
    default:

    System.out.println("enter the valid grade");
    
}







    }
    
}
