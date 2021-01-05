public class StrStr {

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        int index = strStr(haystack,needle);
        System.out.println("index" + index);
    }

    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);


    }
}
