class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minimum = Integer.MAX_VALUE;
        for(String s : strs){
        	if(s.length() < minimum){
        		minimum = s.length();
        	}
        }
        int i = 0;
        while(i < minimum){
        	for(String s: strs){
        		if(s.charAt(i) != strs[0].charAt(i)){
        			return strs[0].substring(0, i);
        		}
        	}
        	i++;
        }
        return strs[0].substring(0,i);
    }
}

public class LongestCommon{
	public static void main(String[] args){
		String[] s1 = {"flower","flow","flight"};
		String[] s2 = {"dog","racecar","car"};
		Solution obj1 = new Solution();
		Solution obj2 = new Solution();
		String res1 = obj1.longestCommonPrefix(s1);
		String res2 = obj2.longestCommonPrefix(s2);
		
		System.out.println("The Prefix of" +s1+ " and " +s2+ " is " +res1+ " and " +res2+ " respectively");
	}
}
