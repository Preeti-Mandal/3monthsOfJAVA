public class Factorial {
    //FACTORIAL OF N
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1= Fact(n-1); //yeh 0 tak calculate hoga uske baad next statement mai execute hoga.
        int fn= n * fnm1;
        return fn;
    }

    //Print sum of first n natural number
    public static int printSum(int s){
        if(s==1){
            return 1;
        }
        int Snm1= printSum(s-1); //yeh 0 tak calculate hoga uske baad next statement mai execute hoga.
        int sum= s + Snm1;
        return sum;
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));  //TC: O(n)
        
        int s=5;
        System.out.println(printSum(s)); //TC: O(n)
        
    }
    
}
