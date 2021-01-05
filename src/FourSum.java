import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {



    public static void main(String[] args) {

        int[] nums =  {-2,-1,-1,1,1,2,2};
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);
        System.out.println(result);

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {


        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i=0;i<nums.length-3;i++) {
            for (int j=nums.length-1;j>2;j--){

            int low = i + 1;
            int high = j - 1;
            // int sum = -nums[i];

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }


            while ((low < high)) {
                if (nums[low] + nums[high] + nums[j] + nums[i] == target) {

                    if(!result.contains(Arrays.asList(nums[i], nums[low], nums[high],nums[j]))) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high], nums[j]));
                    }


                    while((i<low) && (low<high) && (high<j) && nums[low] == nums[low + 1] ){
                        low++;

                    }
                    while((i<low) && (low<high) && (high<j) && nums[high] == nums[high - 1]){
                        high--;

                    }

                    low++;
                    high--;
                }
                else if (nums[low] + nums[high] + nums[j] + nums[i] > target){
                    high--;
                }
                else if (nums[low] + nums[high] + nums[j] + nums[i] < target){
                    low++;
                }
         }


        }}


        return result;
    }
    }




