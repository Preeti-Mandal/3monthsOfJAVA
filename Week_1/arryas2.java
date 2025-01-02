import java.util.*;
public class arryas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size]; //ARRAY

      //Input
      for(int i=0; i<size; i++) {
        nums[i] = sc.nextInt();
    }


        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            } 
            if((nums[i]>max)){
                max=nums[i];
            } 
        }
        System.out.println("Largest number is : " + max);
            System.out.println("Smallest number is : " + min);
     
    }
    
}
