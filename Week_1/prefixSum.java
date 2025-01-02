public class prefixSum {
    //To find the maxSubarraySum
    public static void PrintSubarraySum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        //insert element in prefix arr
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        //sum of prefix arr
        
    }
    
}
