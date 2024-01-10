package programs;

public class RepeatElementArray {
    public static void main(String[]args){

int []ar={23,45,67,87,56,67,45,67};
int count =0;
for(int i=0;i<ar.length;i++){

    if(67==ar[i]){
        count++;
        
    }
}
System.out.println(count);


    }
    
}
