public class binary {
    public static int binarySearch(int nums[], int key){
        int n=nums.length;
        int start=0;
        int end= n-1;

        while(start<=end){
            int mid=(start+end)/2;
            //comparisons
            if(nums[mid]==key){
                return mid;
            } else{
                if(nums[mid]<key){
                    //right
                    start=mid+1;
                } else{
                    //left
                    end=mid-1;
                }
            }
           
        }
        return -1;  //no key found
       

    }

    public static void main(String args[]){
        int nums[]={ 2,4,6,8,10,12,14};
        int key=10;
        System.out.println("key found at index:" + binarySearch(nums, key)); 

        //TIME COMPLEXITY OF BINARY SEARCH IS O(logn).
    }
   
    
}
