package programs;

public class MethodOverloading {

    public void  add(int a,double b){

        System.out.println(a+b);
    }

    public void add(double a,int b){

        System.out.println(a+b);
    }
    public static void main(String[]args){

        int a=10;
        double b=2.3;

        double c=10.3;
        int d=10;


        MethodOverloading m=new MethodOverloading();
        m.add(a,b);
        m.add(c, d);
    }
}
