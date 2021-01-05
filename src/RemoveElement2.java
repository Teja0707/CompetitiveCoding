import java.util.ArrayList;

public class RemoveElement2 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 2;

        int result = removeElement(nums,val);
        System.out.println("\n" + result);
    }
    public static int removeElement(int[] nums, int value) {

        //Arrays.sort(nums);

        ArrayList<Integer> indices = new ArrayList<>();
        int val = 0,temp, countDig =0;
        int i;

        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        //Distinct element indices in integer
        for (i=0;i < nums.length;i++){
            if(nums[i] != value){
                indices.add(i);
            }
        }

        System.out.println("indices " + indices);


        for (i=1;i < indices.size();i++){
            nums[i] = nums[indices.get(i)];
        }


        System.out.println("-----nums-------");
        for (i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


        return indices.size();


    }
}
