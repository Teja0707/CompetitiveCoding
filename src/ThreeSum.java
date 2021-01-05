import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    //SUCCESS
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {

            //Sort arrays
            Arrays.sort(nums);

            // build response List
            List<List<Integer>> result = new LinkedList();

            for (int i=0;i<nums.length-2;i++) {

                int low = i + 1;
                int high = nums.length - 1;
                // int sum = -nums[i];

                if(i>0 && nums[i] == nums[i-1]){
                    continue;
                }

                while (low < high) {
                    if (nums[low] + nums[high] + nums[i] == 0) {
                            result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while(low < high && nums[low] == nums[low + 1]){
                            low++;

                        }
                        while(low < high && nums[high] == nums[high - 1]){
                            high--;

                        }
                        low++;
                        high--;
                    }
                    else if (nums[low] + nums[high] > -nums[i]){
                        high--;
                    }
                    else if (nums[low] + nums[high] < -nums[i]){
                        low++;
                    }


                }

            }

            return result;

        }
}
