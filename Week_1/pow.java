
import java.util.*;

public class pow{
    public static void nums(int x, int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;   
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base(x)");
        int x = sc.nextInt();

        System.out.println("Enter the power(n)");
        int n = sc.nextInt();

        nums(x,n);
    }
    
}
