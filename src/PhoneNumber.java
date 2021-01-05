import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

    public static void main(String[] args) {

        System.out.println(letterCombinations("2368"));
    }

    public static List<String> letterCombinations(String digits) {



        List<String> phone = new ArrayList<>();
        List<String> Values = new ArrayList<>();

        if(digits.length() == 0){
            return Values;
        }

        String[] num = digits.split("");
//        int[] indices = new int[num.length];
//
//        for(int i=0;i<num.length;i++){
//            indices[i] = Integer.parseInt(num[i]);
//        }

        phone.add("");
        phone.add("");
        phone.add("abc");
        phone.add("def");
        phone.add("ghi");
        phone.add("jkl");
        phone.add("mno");
        phone.add("pqrs");
        phone.add("tuv");
        phone.add("wxyz");


        int i=0;
        char w,x,y,z;


        i=0;

        if(num.length == 1){
            for (int j = 0; j < phone.get(Integer.parseInt(num[0])).length(); j++) {
                w = phone.get(Integer.parseInt(num[0])).charAt(j);
                Values.add(String.valueOf(w));
            }

        }

        if(num.length == 2) {
            for (int j = 0; j < phone.get(Integer.parseInt(num[0])).length(); j++) {
                for (int k = 0; k < phone.get(Integer.parseInt(num[1])).length(); k++) {
                    w = phone.get(Integer.parseInt(num[0])).charAt(j);
                    x = phone.get(Integer.parseInt(num[1])).charAt(k);
                    Values.add(w + String.valueOf(x));
                }
            }
        }
        if(num.length == 3) {
            for (int j = 0; j < phone.get(Integer.parseInt(num[0])).length(); j++) {
                for (int k = 0; k < phone.get(Integer.parseInt(num[1])).length(); k++) {
                    for (int l = 0; l < phone.get(Integer.parseInt(num[2])).length(); l++) {
                        w = phone.get(Integer.parseInt(num[0])).charAt(j);
                        x = phone.get(Integer.parseInt(num[1])).charAt(k);
                        y = phone.get(Integer.parseInt(num[2])).charAt(l);
                        Values.add(w + String.valueOf(x) + y);
                    }
                }
            }
        }

        if(num.length == 4) {
            for (int j = 0; j < phone.get(Integer.parseInt(num[0])).length(); j++) {
                for (int k = 0; k < phone.get(Integer.parseInt(num[1])).length(); k++) {
                    for (int l = 0; l < phone.get(Integer.parseInt(num[2])).length(); l++) {
                        for (int m = 0; m < phone.get(Integer.parseInt(num[3])).length(); m++) {

                            w = phone.get(Integer.parseInt(num[0])).charAt(j);
                            x = phone.get(Integer.parseInt(num[1])).charAt(k);
                            y = phone.get(Integer.parseInt(num[2])).charAt(l);
                            z = phone.get(Integer.parseInt(num[3])).charAt(m);
                            Values.add(w + String.valueOf(x) + y + z);
                        }
                    }
                }
            }
        }
//        System.out.println(phone.get(indices[1]).charAt(0));
//        System.out.println(Values);
        return Values;

    }

}
