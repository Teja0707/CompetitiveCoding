public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3};
        int val = 2;

        int result = removeElement(nums,val);
        System.out.println("\n" + result);
    }
    public static int removeElement(int[] nums, int val) {

        int i=0,j =nums.length-1;

        int temp;

        while (i<j){

            while (nums[j] == val){
                j--;
                if(j<0) return 0;
            }
            while (nums[i] == val){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                if(i==j) break;
            }

        }

        int count = 0;
        for (i=0;i<nums.length;i++){

            if(nums[i] != val)count++;

        }

       return count;
    }
}
