
public class Strings {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //SOUTH
            if(dir=='S'){
                y--;
            }
            //NORTH
            else if(dir=='N'){
                y++;
            }
            //EAST
            else if(dir == 'E'){
                x++;
            }
            //WEST
            else{
                x--;
            }

            
        }

        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        // //String Concatenation
        // String firstName= "Preeti";
        // String lastName= "Mandal";
        // String fullName=firstName+"_"+lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(6)); //o/p- space(_).

        // printLetters(fullName);



        String path= "WNEENESENNN";
        System.out.println(getShortestPath(path));
    
    }

    
}
