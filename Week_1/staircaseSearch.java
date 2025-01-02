
public class staircaseSearch {
    public static boolean searchKey(int matrix[][], int key){
         //TC: O(n+m), depend on which is greater.
        int row=0;
        int col=matrix[0].length-1;
        
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            } else if(key<matrix[row][col]){
                col--;
            } else{
                row++;
            }
    
        }
        System.out.println("Key not found.");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};

        searchKey(matrix,33); 
        searchKey(matrix,32); 
        searchKey(matrix,50); 


    }
}
