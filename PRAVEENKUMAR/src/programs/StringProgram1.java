package programs;

public class StringProgram1 {

    public static void main(String []args){

        String pk=new String("computer science and enginceering");

        System.out.println(pk.length());

        int first=pk.charAt(0);
        int count=1;

        for(int i=0;i<pk.length();i++){

            if(first==pk.charAt(i)){
                count ++;
            }
          
        }
        System.out.println(count);

    }
    
}
