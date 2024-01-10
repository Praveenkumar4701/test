package programs;
import java.util.*;


public class Stack {
     int max=4;
    int top=-1;
    
    int arr[]=new int[max];
    public static void main(String...args){

        Stack s=new Stack();
         int choice;
          Scanner sc=new Scanner(System.in);
do{
       

       
        System.out.println("Enter your choice 1) push\n 2)pop \n 3)peek\n 4)exit");
        choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("enter the element to be pussed");
           int data=sc.nextInt();
           s.push(data);
           break;

           case 2:
           System.out.println("popped element :"+s.pop());
           break;

           case 3:
           System.out.println("top of the element:"+s.peek());
           break;

           case 4: 
           break;
  }


}
while(choice!=4);

    }

    void push(int data){
if(top==max-1){

    System.out.println("stack overflow:Stsck already full");

}
else{
    top++;
  arr[top]=data;

}

    }
    int pop(){

        if(top==-1){
            System.out.println("StackOverFlow ");

        }
        else
            top--;
            return arr[top+1];  
        }

     int peek(){
      
        if(top==-1){
            System.out.println("StackOverFlow ");

        }
        else {
       
        }
        return arr[top];  
}
}
