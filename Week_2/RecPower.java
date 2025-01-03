public class RecPower {
    //Print a program for  x raised to the power n.
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn= x*xnm1;
        //  return xn;

        return x*power(x,n-1);
    }

    //Optimized solution
    public static int optimisedPower(int a, int n){
        if(n==0) return 1;
        //n is even
        //int halfPowerSq=optimisedPower(a, n/2) * optimisedPower(a, n/2); //TC: O(n)

        int halfPower= optimisedPower(a, n/2); //Pehle he value calculate krke store krlo to avoid repeted calculation of the same thing.
        int halfPowerSq=halfPower*halfPower;  // TC: O(logn) =>much better

        //n is odd
        if(n%2!=0){
            halfPowerSq= a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(power(2,4));
        System.out.println(power(3,3));
        System.out.println(power(10,3));
        System.out.println(power(9,2));
       System.out.println("Optimised solution");
        System.out.println(optimisedPower(2, 10));
        System.out.println(optimisedPower(3, 4));
        System.out.println(optimisedPower(2, 5));
        System.out.println(optimisedPower(2, 0));
    }
    }
    
   
