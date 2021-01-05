public class WaterContainer {

    public static void main(String[] args) {
      int[]  height = {1,8,6,2,5,4,8,3,7};
      int max = maxArea(height);
        System.out.println(max);
    }

    public static int maxArea(int[] height) {

        int max = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j >= 0; j--) {

                if (Math.abs(j - i) * Math.min(height[i], height[j]) > max)
                    max = Math.abs(j - i) * Math.min(height[i], height[j]);
            }
        }

        return max;

    }
}
