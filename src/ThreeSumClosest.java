import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {

        int[] nums = {-1,2,1,4};

        System.out.println("Closest : " + threeSumClosest(nums,1));
    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int sum = nums[0] + nums[1] + nums[2];
        int closest = Math.abs(target-sum);
        int closeSum = sum;


        for (int i=0; i<nums.length-2;i++){
            for (int j = i+1; j<nums.length-1;j++){
                for (int k= j+1; k<nums.length;k++){

                    sum = nums[i] + nums[j] + nums[k];

                    if(closest > Math.abs(target-sum)){

                        closest = Math.abs(target-sum);
                        closeSum = sum;
                        System.out.println("sum " + sum);
                        System.out.println("closest " + closest);
                    }
                }
            }
        }

        return closeSum;

    }
}
