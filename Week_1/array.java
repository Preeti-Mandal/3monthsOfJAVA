

import java.util.*;
public class array {
    public static void main(String[] args) {
        //Q-Take an array of names as input from the user and print them on the screen.

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];

        //INPUT

        for(int i=0; i<names.length; i++){
            names[i] = sc.next();
        }

        //OUTPUT

        for(int i=0; i<names.length; i++){
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
 


        
    }
}