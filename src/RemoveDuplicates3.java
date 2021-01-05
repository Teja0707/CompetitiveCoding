public class RemoveDuplicates3 {
    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println("nums.length " +removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {

      //SUCCESS

            String indices = "0";
            int val = 0,temp, countDig =0;
            int i;

            if(nums.length == 0 || nums.length == 1){
                return nums.length;
            }

            //Distinct element indices in integer
            for (i=0;i < nums.length-1;i++){
                if(nums[i] != nums[i+1]){
                    indices = indices + " " + (i+1);
                }
            }

            System.out.println(indices);
            String arr[] = indices.split(" ");

            for (i=1;i < arr.length;i++){
                nums[i] = nums[Integer.parseInt(arr[i])];
            }


            System.out.println("-----nums-------");
            for (i=0;i<nums.length;i++){
                System.out.println(nums[i]);
            }

            return arr.length;

        }


    }
