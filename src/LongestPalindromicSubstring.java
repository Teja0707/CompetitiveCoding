public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s = "ac";
        String result = longestPalindrome(s);
        System.out.println("result  : " + result);


    }

    public static String longestPalindrome(String s) {

        if(s.length() == 1)return s;
        else if (s.length() == 2){
            if(s.charAt(0) == s.charAt(1))return s;
            else return s.substring(1);
        }
        else {
            return longestPalindrome1(s);
        }

    }

    public static String longestPalindrome1(String s) {

        int i = 0, j = s.length() - 1;

        int pointer = s.length()/2;

        if(s.length() == 1)return "";
        else {
            if(s.charAt(pointer-1) == s.charAt(pointer+1)){

                return longestPalindrome1(s.substring(0,pointer-1)) + s.charAt(pointer-1) + s.charAt(pointer) + s.charAt(pointer+1) +longestPalindrome1(s.substring(pointer+1,s.length()-1));
            }
            if(s.charAt(pointer) == s.charAt(pointer+1)){

                return s.charAt(pointer)+s.charAt(pointer+1)+longestPalindrome1(s.substring(pointer+2,s.length()-1));

            }
            if(s.charAt(pointer-1) == s.charAt(pointer)){


                return longestPalindrome1(s.substring(0,pointer-1)) + s.charAt(pointer-1) +s.charAt(pointer);

            }
        }
        return "";

    }


}
