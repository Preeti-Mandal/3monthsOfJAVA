public class RecursionProblem {
        public static int firstOccurence(int arr[], int key, int i){
            if(i==arr.length){
                return -1;
            }
            if(arr[i]==key){
                return i;
            }
            return firstOccurence(arr, key, i+1);
        }
        public static int lastOccurence(int arr[], int key, int i){
            if(i==arr.length){
                return -1;
            }

            int isFound=lastOccurence(arr, key, i+1);

            if(isFound == -1 && arr[i]==key){
                return i;
            }
            //check with Self
            // if(arr[i]==key){
            //     return i;
            // }
            return isFound;

        }

        public static void main(String[] args) {
            int arr[]={2,3,6,5,2,4,8};
            System.out.println(firstOccurence(arr,4,0 ));
            System.out.println(lastOccurence(arr,2,0 ));
        }
    
}
