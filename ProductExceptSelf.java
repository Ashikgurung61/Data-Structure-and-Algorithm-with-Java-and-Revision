import java.util.Arrays;
class Solution{
	public int[] productExceptSelf(int[] nums){
		int N = nums.length;
		int[] res = new int[N];
		int left = 1, right = 1;
		for(int i = 0; i < N; i++){
			res[i] = left;
			left *= nums[i];
		}
		for(int j = N - 1; j >= 0; j--){
			res[j] *= right;
			right *= nums[j];
		}
		return res;
	}
}
class ProductExceptSelf{
	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		Solution obj = new Solution();
		int[] res = obj.productExceptSelf(nums);
		int[] ans = {24,12,8,6};
		if (Arrays.equals(res, ans)){
			System.out.println("Testing Successful");
		}
		else{
			System.out.println("Testing Failed");
		}
	}
}
