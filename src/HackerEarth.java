public class HackerEarth {

    public static void main(String[] args) {
        String input = "aabcdbba";
        int mid = input.length()/2;
        input = input.substring(mid) + input.substring(0,mid);
        System.out.println("input " + input);
        String minimized = stringMinimizer(input);
        System.out.println(minimized);
        System.out.println(minimized.length());
    }

    // Idea : Workout 2 pointer method;
    // direct 2 pointers to the mid, parse one through the left and one through the right, keep checking until the
    // values are distinct
    // Find the index and concat

    public static String stringMinimizer(String input){

        int mid = input.length()/2;

        if(input.charAt(mid) != input.charAt(mid+1)) return input;

        int i = mid;
        int j = mid+1;
        char midValue = input.charAt(i);

        while (input.charAt(i) == input.charAt(j)){

            while (midValue == input.charAt(i)){
                System.out.println("i " + i);
                System.out.println("input.charAt(i)" + input.charAt(i));
                i--;
            }
            while (midValue == input.charAt(j)){
                System.out.println("j " + j);
                System.out.println("input.charAt(j)" + input.charAt(j));
                j++;
            }
            System.out.println(i + " " + j);
//            mid = input.length()/2;
//            midValue = input.charAt(mid);

        }

        input = input.substring(0,i) + input.substring(j);

        return stringMinimizer(input);
    }
}
