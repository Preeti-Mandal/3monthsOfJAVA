public class reverse {
    //For reversing an array, it's better to use the below swapping method rather than creating an another array and then reversing it as it ocuupies more space.

    public static void reverseArray(int nums[]) {
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {   //we're comparing indexes not values.
            //swapping
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;

        }

    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 7, 4, 5, 9};
        reverseArray(nums);

        //print
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    //TIME COMPLEXITY: O(n); Space complexity: O(1)=>constant

}
