public class MedianOfTwoSortedArrays {

    //Successful
    public static void main(String[] args) {

        double median;
        int[] nums1 = {1,2}, nums2 = {3,4};

        median = findMedianSortedArrays(nums1,nums2);

        System.out.println(median);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int i=0,j=0,pointer=0;
        int[] merger = new int[m+n];

       while (i<m && j<n){

               if(nums1[i] < nums2[j]){
                   merger[pointer] = nums1[i];
                   i++;
                   pointer++;
               }else {
                   merger[pointer] = nums2[j];
                   pointer++;
                   j++;
               }
           }
       if(i<m){
           for (int k = i; k<m;k++){
               merger[pointer] = nums1[k];
               pointer++;
           }
       }
       if(j<n){
           for (int k = j; k<n;k++){
               merger[pointer] = nums2[k];
               pointer++;
           }
       }

       int k = merger.length;
       if (k%2 != 0) return merger[k/2];
       else {
           return (double) (merger[(k/2)-1] + merger[(k/2)])/2;
       }

    }
}
