package basics;

public class Constructor {
    public static void main(String[]args){

        
        int b=10;
    Constructor c=new Constructor(b);
        Constructor k=new Constructor();
      System.out.println(c.a);




    }
     int a;
     Constructor(int a){
         System.out.println("hello world");

     }
     Constructor(){
        System.out.println("ab");

     }
     static{
        System.out.println("hello");
     }
     
     
}
