class Solution{
     public String MergeTwoString(String word1, String word2){
         int N = word1.length(), M = word2.length();
         int i = 0, j = 0; 
         int word = 1;
         StringBuilder res = new StringBuilder();
         while (i < N && j < M){
              if (word == 1){
                   res.append(word1.charAt(i++));
                   word = 2;
              }
              else{
                   res.append(word2.charAt(j++));
                   word = 1;
              }
         }
         while (i < N){
              res.append(word1.charAt(i++));
         }
         while (j < M){
              res.append(word2.charAt(j++));
         }
         return res.toString();
     }
}


public class August16{
       public static void main(String[] args){
            String word1 = "abc", word2 = "pqr";
            Solution obj = new Solution();
            String result = obj.MergeTwoString(word1, word2);
            System.out.println("The Two Merge String are: " +result);   
       }
}
