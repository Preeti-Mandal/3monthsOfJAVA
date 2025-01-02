public class diagonalSum {
    public static void Diagonal(int matrix[][]){
        //optimised solution => TC-O(n)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //Primary Diagonal
            sum+=matrix[i][i];

            //Secondary Diagonal
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

        Diagonal(matrix);                 
    }
    
}
