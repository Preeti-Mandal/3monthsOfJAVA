import java.util.*;

public class Factorial{

    //Function definition
    public static void factorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("INVALID INPUT");
            return;
        }else{
        for(int i=n; i>=1; i--){
            fact= fact*i; //decreasing order since i=n
        }
        System.out.println(fact);

    }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n); //funcion call.


    }


    
}
