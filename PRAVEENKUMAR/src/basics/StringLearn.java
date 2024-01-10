package basics;

public class StringLearn {

    public static void main(String[]args){

//declaration of string

            String st=new String("praveen");

            st="hello world!";
//String immutable
            String sc="praveen kumar";
            String se="Praveen kumar";
           System.out.println(se.replace("Praveen", "kumar"));

            System.out.println(st);
// common methods
            System.out.println(sc.length());
            System.out.println(sc.isEmpty());
            System.out.println(sc.isBlank());
            System.out.println(sc.toLowerCase());
            System.out.println(sc.toUpperCase());

            boolean c=sc.equalsIgnoreCase(se);
            System.out.println(c);

            
System.out.println(sc.compareTo(se));
System.out.println(sc.compareToIgnoreCase(se));

System.out.println(sc.startsWith("p"));
System.out.println(sc.endsWith("k"));


// index methods 
 String pk=new String("GCE DHARMAPURI");
  
  System.out.println(pk.indexOf("D"));
  System.out.println(pk.indexOf("E DHAR"));
  System.out.println(pk.lastIndexOf("A"));//09
  System.out.println(pk.lastIndexOf("PUR"));//10


  // get the character

  System.out.println(pk.charAt(5));


    // other methods       
String pl=new String("     GCE DHARMAPURI");

   System.out.println(pl.strip());

   System.out.println(pl.indent(20));

   System.out.println(pl.length());
   System.out.println(pl.repeat(10));
   
  
       




    }
    
}
