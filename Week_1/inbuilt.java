import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
    public static void main(String[] args) {
         Integer[] nums={10,20,30,40,50};
         
        Arrays.sort(nums);
        System.out.println("Ascending order: " + Arrays.toString(nums));

        Arrays.sort(nums,0,4); //(arr, startingIndex, endingIndex(excluded)).
        System.out.println("Subarray sorted in ascending order: " + Arrays.toString(nums));

         Arrays.sort(nums,Collections.reverseOrder());  //change every int to Integer since it works on object type data rather than primitive type.
         System.out.println("Descending order: " + Arrays.toString(nums));


         Arrays.sort(nums,0,4,Collections.reverseOrder());
         System.out.println("Subarray sorted in descending order: " + Arrays.toString(nums));
    }
}
