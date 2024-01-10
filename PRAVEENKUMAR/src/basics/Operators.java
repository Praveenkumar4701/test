package basics;

public class Operators {
public static void main(String...args){
Operators op=new Operators();
arithmetic();
op.logical();
 op.bitwiseOperator();
 relationalOperator();
 unaryOperator();

    
}

private static void arithmetic(){

//addition
        int a=20,b=20;
     System.out.println("Addition "+(a+b));
 //subtraction   
        System.out.println("Subtraction "+(a-b));
 //multiplication
       System.out.println("Multiplication "+ (a*b));
  //division
        System.out.println("Division "+(a/b)); //output is Quatient   
        System.out.println(a%b);  //output is remainder
   
    
}
void logical(){
int a=10;
    //And two conditions true
   if(a==0 && a==10){
System.out.println("hello");
   }
else{
    System.out.println("hi");
}

//Or any one condition true
if(a==0 || a==10){
System.out.println("hello praveen");
}


   }

   /**
    * 
    */
   void bitwiseOperator(){

      //bitwise and 

      int a=10,b=20;

      System.out.println(a&b);/*  A     B 
                                 0      0    0
                                 0      1    0   & two condition true
                                 1      0    0    | any one condition true
                                 1      1    1 */
       System.out.println(a|b);

       System.out.println(a^b);

       System.out.println(~a);
       System.out.println(~b);

       int c=a<<b;  //left shift a*2^b
      
       System.out.println(c);

       int r=a>>b; // right shift a/2^b
       System.out.println(r);
  }

 static void relationalOperator(){

int a=3,b=3;

System.out.println(a==b);
System.out.println(a!=b);

System.out.println(a>b);
System.out.println(a<b);
System.out.println(a<=b);
System.out.println(a>=b);

}

static void unaryOperator(){

int a=20;

System.out.println(a++);//pre increament 20
System.out.println(++a);// post increament 22

System.out.println(a--);//pre decreament 22
System.out.println(--a);//post decreament 20





}


      
   }



    



