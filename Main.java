import java.util.HashSet;
import java.util.Set;

class ClosestZero{
    public int findClosestNumber(int[] nums)
    {
        int res = nums[0];
        for (int num: nums){
            if (Math.abs(num) < Math.abs(res)){
                res = num;
            }
        }
        if (res < 0 && contain(nums, Math.abs(res))){
            return Math.abs(res);
        }
        else{
            return res;
        }
    }
    private boolean contain(int[] nums, int target){
        for (int x: nums){
            if (x == target){
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args){
        ClosestZero obj = new ClosestZero();
        int[] nums = {2, -1, 3, -2, 4, 1};
        int result = obj.findClosestNumber(nums);
        System.out.println("The closest number to zero is: " + result);
        
        int[] num0 = {5, 3, 1, -1, 3};
        int res = obj.findClosestNumber(num0);
        System.out.println("Result: " +res);
    }
}
