public class RecImpProblems {
    //COMPANY QUESTIONS

    //Tiling Problem

    //Q1-Floor size=(2 x n) and Tile size=(2 x 1)

    public static int tilingProblem(int n){  
        //base case
        if(n==0 || n==1) return 1;
        
        //Vertical choice
        int verticalTile= tilingProblem(n-1);

        //Horizontal choice
        int horizontalTile= tilingProblem(n-2);

        int Tways= verticalTile + horizontalTile; //TotalWays in which tiles can be arranged
        return Tways;
    }

    //Q2-Floor size=(4 x n) and Tile size=(4 x 1)
    public static int anotherTilingProb(int n){
        //base case
        if(n==0 || n==1 || n==2 || n==3) return 1;

        int verticalChoice= anotherTilingProb(n-1); //vertical Tiles
        int horizontalChoice= anotherTilingProb(n-4); //Horizontal Tiles

        // int Tway= verticalChoice+horizontalChoice;
        // return Tway;

        return verticalChoice+horizontalChoice;
    }
     
    public static void main(String args[]){
        System.out.println(" (2 x n)type of Tiling Problem");
        System.out.println(tilingProblem(3));
        System.out.println(tilingProblem(4));
        System.out.println(tilingProblem(5));

       System.out.println(" (4 x n)type of Tiling Problem");
       System.out.println(anotherTilingProb(2));
        System.out.println(anotherTilingProb(3));
        System.out.println(anotherTilingProb(4));
        System.out.println(anotherTilingProb(5));
        System.out.println(anotherTilingProb(6));
        System.out.println(anotherTilingProb(7));


    }
    
}
