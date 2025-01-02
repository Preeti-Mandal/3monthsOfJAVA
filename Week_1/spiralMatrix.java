
public class spiralMatrix {
    public static void Spiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){   

            //top   => SR-fixed(0) , SC->EC
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            //right  => EC->fixed(3), SR+1->ER
            for(int i=startRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom => ER->fixed(3), EC-1->SC
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){  //TO AVOID DUPLICATE PRINTING
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }

            //left  => SC->fixed(0), ER-1->SR+1
            for(int i=endRow-1;i>=startRow+1;i--){
                    if(startCol==endCol){  //TO AVOID DUPLICATE PRINTING
                        break;
                    }
                System.out.print(matrix[i][startCol]+ " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
        System.out.println();


    }

    public static void main(String[] args) {
        // int matrix[][]={{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};

        int matrix[][]= {{1,2,3},
                         {4,5,6}};

        Spiral(matrix);                
    }
    
}
