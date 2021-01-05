import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

       public static void main(String[] args) {

        List<String> bracketArray = new ArrayList<String>();
        String brackets="";
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter n");
           int n = sc.nextInt();
        System.out.println(pairs(bracketArray,brackets,n,0,0));

    }

    public static List<String> pairs(List<String> bracketArray,String brackets,int n,int open_brackets, int close_brackets){

        if(close_brackets==n && !bracketArray.contains(brackets)){
            bracketArray.add(brackets);

        }
        else{

            if(close_brackets < open_brackets){
                pairs(bracketArray,brackets + ")",n,open_brackets,close_brackets+1);
            }
            if(open_brackets < n){

                pairs(bracketArray,brackets + "(",n,open_brackets+1,close_brackets);
            }

        }

        return bracketArray;
    }

}
