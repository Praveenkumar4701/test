package programs;
import java.util.*;

public class OddEven {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the number:");

    int num=sc.nextInt();

    int num2=1;

    int total=num&num2;

    if(total==0){
        System.out.println(num+"is even number");
    }
    else{
        System.out.println(num+"is odd number");
    }



}

}
