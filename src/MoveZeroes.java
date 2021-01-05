import java.util.ArrayList;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(nums);

    }

    public static void moveZeroes(int[] nums) {

        int value = 0;

        ArrayList<Integer> indices = new ArrayList<>();
        int val = 0,temp, countDig =0;
        int i;

        if(nums.length == 0){

            return;
        }

        if(nums.length == 1 && nums[0] == value){
            nums = null;
            return;
        }else if(nums.length == 1 ){
            return;
        }


        //Distinct element indices in integer
        for (i=0;i < nums.length;i++){
            if(nums[i] != value){
                indices.add(i);
            }
        }

        System.out.println("indices " + indices);


        for (i=0;i < indices.size();i++){
            nums[i] = nums[indices.get(i)];
        }


        System.out.println("-----nums-------");
        for (i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


    }
}
