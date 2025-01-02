public class Recursion{
    //Print numbers from n to 1(dereasing order)
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print((n + " "));
        printDec(n-1);
    }

    //Print numbers from 1 to n(Increasing order)
    public static void printInc(int n){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        printInc(n-1);
        System.out.print((n + " "));
       
    }

    public static void main(String[] args) {
        int n =10;
         printDec(n);
        printInc(n);
    }
}