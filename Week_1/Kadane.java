


public class Kadane {
    //Kadane's Algo, if the elements are-ve then this method is not suitable.
    public static void maxSubarraySum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum<0) {
                currSum=0;
             } 
             maxSum=Math.max(currSum, maxSum);  
        }
       
        System.out.println("Max sum of the subarray is: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(arr);
    }
    

    
}
