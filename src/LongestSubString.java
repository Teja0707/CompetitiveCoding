import java.util.HashSet;

public class LongestSubString {

    //TWO POINTER APPROACH
    public static void main(String[] args) {
        String s = "abcabcbb";
        int longest = lengthOfLongestSubstring(s);
        System.out.println("Longest " + longest);
    }

    public static int lengthOfLongestSubstring(String s) {

        int a_pointer=0, b_pointer=0, max = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (b_pointer != s.length()){

            if(!hashSet.contains(s.charAt(b_pointer))){
                hashSet.add(s.charAt(b_pointer));
                max = Math.max(hashSet.size(),max);
                b_pointer++;
            }else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }

        }

        return max;
    }

}
