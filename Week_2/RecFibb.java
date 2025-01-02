public class RecFibb {
    //Print Nth Fibonacci number- 0 1 1 2 3 5 8 13 21 ....

    public static int Fibb(int N){
        if(N==0 || N==1){
            return N;
        }
        int fnm1= Fibb(N-1);
        int fnm2= Fibb(N-2);
        int Fn = fnm1 + fnm2;
        return Fn;
    }

    public static void main(String[] args) {
        int N = 9;
        System.out.println(Fibb(N));  //SC: O(N), TC: O(2^n)-exponential(worst TC)
    }
    
}
