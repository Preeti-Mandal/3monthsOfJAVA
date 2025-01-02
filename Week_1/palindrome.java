public class palindrome {
    //Palindrome String("noon", "racecar", "madam").
    public static boolean isPalindrome(String str){
        int n =str.length();
        for(int i=0;i<n/2;i++){
            //compare
            if(str.charAt(i)!=str.charAt(n-1-i)) {
                //notPalindrome
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        String str = "NOON";
        System.out.println(isPalindrome(str));
        

   
    
    }   
}
