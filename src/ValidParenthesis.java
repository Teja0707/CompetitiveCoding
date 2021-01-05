import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {

    public static void main(String[] args) {
        int sub = longestValidParentheses(")(((((()()())()((");
        System.out.println(sub);

    }

    public static int longestValidParentheses(String s) {


        List<String> brackets = new ArrayList<String>();
        int n = s.length()/2;

        for(int i=1;i<=n;i++){
            brackets = generateParenthesis(i, brackets);

        }

        n = s.length();
        String sub = "";
        String largest = "";
        for(int j=n;j>0;j--) {
        for(int i=0; i<j;i++) {

               sub = s.substring(i,j);
           //    System.out.println(" substring:" + sub);
               if(brackets.contains(sub) && sub.length() > largest.length()){
                   largest= sub;
               //    System.out.println(largest + " largest ");
                   break;
               }

           }
        }

        return largest.length()/2;
    }

    public static List<String> generateParenthesis(int n,List<String> bracketArray) {

        String brackets="";
        return pairs(bracketArray,brackets,n,0,0);

    }

    public static List<String> pairs(List<String> bracketArray, String brackets, int n, int left_brackets, int right_brackets){

        if(right_brackets==n && !bracketArray.contains(brackets)){
            bracketArray.add(brackets);
        }
        else{

            if(right_brackets < left_brackets){
                pairs(bracketArray,brackets + ")",n,left_brackets,right_brackets+1);
            }
            if(left_brackets < n){
                pairs(bracketArray,brackets + "(",n,left_brackets+1,right_brackets);
            }

        }

        return bracketArray;
    }
}
