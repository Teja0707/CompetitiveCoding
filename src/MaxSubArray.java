public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {-21,-1,-3,-4,-10,-2,-10,-5,-4};

        int max = maxSubArray(nums);

        System.out.println(max);
    }

    public static int maxSubArray(int[] nums) {

        int curSum = 0, max = nums[0];

        for(int i=0;i<nums.length;i++){

            if(curSum < 0) curSum = 0;

            curSum = curSum + nums[i];

            max = Integer.max(max,curSum);
        }

        return max;

    }
}
