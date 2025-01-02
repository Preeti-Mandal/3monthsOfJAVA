import java.util.*;

public class Fibonacci{

    public static void fibb(int n){

        int first=0;
        int second=1;
        for (int i=0; i<=n; i++) {
            System.out.println(first + " ");

             //swap
            int next=first + second;
            first=second;
            second=next;
            
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
        //  System.out.println("Fibonacci series upto n term  is:"+fibb(int n));
         fibb(n);
        
        

     

    }
}

