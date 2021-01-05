public class RemoveDuplicates2 {

    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println("nums.length " +removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {

        int val = 0,temp, countDig =0;
        int i;

        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        //Distinct element indices in integer
        for (i=nums.length-1;i>0;i--){
            if(nums[i] != nums[i-1]){
                val = val*10 + i;
            }
        }

        System.out.println("val i : " +val);

        temp = val;

        // count digits
        while(temp != 0)
        {
            temp /= 10;
            ++countDig;
        }

        for (i=1;i<=countDig;i++){
            if(val%10 == 0){
                nums[i] = nums[val%100];
                val = val/100;
                i++;
            }else {
                nums[i] = nums[val%10];
                val = val/10;
            }

        }

        System.out.println("-----nums-------");
        for (i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

        return countDig+1;

    }

}
