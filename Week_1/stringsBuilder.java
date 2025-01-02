public class stringsBuilder {
    public static void main(String[] args) {
         StringBuilder sb= new StringBuilder("");  //it's an object class
         sb.toString(); //Converts the stringbuilder(obj class) into string 

         for(char ch='a';ch<='z';ch++){
            sb.append(ch);
         } //abcdefghijklmnopqrstuvwxyz  
         //TC: O(26)
         System.out.println(sb);
         System.out.println(sb.length());

    }
    
}
