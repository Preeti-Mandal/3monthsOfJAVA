public class bubblesort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void Bsort(int nums[]){
        for(int turn=0;turn<nums.length-2;turn++){
            for(int j=0;j<=nums.length-2-turn; j++){
                if(nums[j]>nums[j+1]){  //for decreasing order use "<"
                    //swap
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        
    }
    public static void main(String[] args) {
        int nums[]= {4,5,1,3,2};
        Bsort(nums);
        printArr(nums);
    }
    
}
