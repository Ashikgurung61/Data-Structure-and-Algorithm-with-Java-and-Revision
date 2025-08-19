class Solution{
    public int SumOfDigit(int nums){
        int res = 0; 
        while (nums > 0){
            int rem = nums % 10;
            res += rem;
            nums /= 10;
        }
        return res;
    }
}
public class Main{
    public static void main(string[] args){
        int nums = 521;
        Solution obj = new Solution();
        int res = obj.SumOfDigit(nums);
        System.out.println("The sum of the digit is: " +res);
    }
}
