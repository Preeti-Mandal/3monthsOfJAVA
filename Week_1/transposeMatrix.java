import java.util.*;


public class transposeMatrix {
    public static void main(String args[]){
        //For a given matrix of N x M, print its transpose.
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(); //rows
        int n=sc.nextInt(); //cols

        int transpose[][]= new int[m][n]; //2DArray

        //INPUT
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                transpose[i][j]=sc.nextInt();
            }
        }

        //OUtput
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.print(transpose[j][j]);
            }
            System.out.println();
        }
        sc.close();
    }
   
    
}
