class Solution{
    public boolean isSequence(String s, String t){
         int i = 0, j = 0;
         while (i < s.length() && j < t.length()){
              if (s.charAt(i) == t.charAt(j)){
                    i++;
              }
              j++;
         }
         return i == s.length();
    }
}

public class IsSequence{
       public static void main(String[] args){
             String word1 = "abc", word2 = "apqbrnc";
             Solution obj = new Solution();
             boolean result = obj.isSequence(word1, word2); 
             System.out.println(word1+" == " +word2+ " is " +result);
       }
}
