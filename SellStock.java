class Solution{
	public int maxProfit(int[] prices){
		int min_profit = Integer.MAX_VALUE;
		int res = 0;
		for(int num : prices){
			if (num < min_profit){
				min_profit = num;
			}
			int profit = num - min_profit;
			
			if (profit > res){
				res = profit;
			}
		}
		return res;
	}
}
public class SellStock{
	public static void main(String[] args){
		int[] nums = {7,1,5,3,6,4};
		Solution obj = new Solution();
		int result = obj.maxProfit(nums);
		System.out.println("The MaxProfit is: " +result);
	}
}
