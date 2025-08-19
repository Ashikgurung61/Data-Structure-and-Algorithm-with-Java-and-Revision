import java.util.Map;
import java.util.HashMap;

class Solution{
     public int romanToInt(String s){
          Map<Character, Integer> d = new HashMap<>();
          d.put('I', 1);
          d.put('V', 5);
          d.put('X', 10);
          d.put('L', 50);
          d.put('C', 100);
          d.put('D', 1000);
          d.put('M', 1000);
          int N = s.length(), res = 0, i = 0;
          while (i < N){
               if (i + 1 < N && d.get(s.charAt(i)) < d.get(s.charAt(i + 1))){
                     res -= d.get(s.charAt(i));
               }
               else{
                     res += d.get(s.charAt(i));
               }
               i += 1;
          }
          return res;
     }
}

public class RomanToInteger{
       public static void main(String[] args){
            String s = "XLIV";
            Solution obj = new Solution();
            int Result = obj.romanToInt(s);
            System.out.println("The integer value of " +s+ " is " +Result);
       }
}
