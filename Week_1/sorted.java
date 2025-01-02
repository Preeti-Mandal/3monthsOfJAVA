
import java.util.*;

public class sorted {
    public static void main(String[] args) {
        
  //Take an array of numbers as input and check if it is an array sorted in ascending order. Eg : { 1, 2, 4, 7 } is sorted in ascending order
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int sorted[]=new int[size];

    //INPUT
    for(int i=0;i<size;i++){
        sorted[i]=sc.nextInt();
    }

    boolean isAscending = true;
     
    for(int i=0; i<sorted.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
        if(sorted[i] > sorted[i+1]) { // This is the condition for descending order
            isAscending = false;
        }
    }


    if(isAscending) {
        System.out.println("The array is sorted in ascending order");
    } else {
        System.out.println("The array is not sorted in ascending order");
    }

    sc.close();
}
}
