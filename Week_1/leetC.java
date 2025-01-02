import java.util.Arrays;

public class leetC {
    //LEETCODE PROB: Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
        public static void sortedSquares(int[] nums) {
            int n =nums.length;
            int arr[]=new int[n];
            
            for(int i=0; i<nums.length; i++){
                arr[i]= nums[i]*nums[i];
            }
           for(int i=0; i<n-1;i++){
               for(int j=0;j<n-1;j++){
                   if(arr[j]>arr[j+1]){
                       //swap
                       int temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                       
                   }
               }
           }
            System.out.println(Arrays.toString(arr));
        }

        public static void main(String args[]){
            int nums[] = {0,4,6,8,};
            sortedSquares(nums);
             
        }
    }
    

