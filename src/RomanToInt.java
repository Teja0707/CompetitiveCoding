public class RomanToInt {

    public static void main(String[] args) {

        int result = romanToInt("D");
        //System.out.println(result);

    }

    public static int romanToInt(String s) {

        if(s.length() == 1)return val(s);
        String[] arr = s.split("");
        int result = 0, i;
        int operator = 1;
        boolean add = true;

        for (i=0;i<arr.length-1;i++){
            if(val(arr[i]) < val(arr[i+1])) add = false;
            else add = true;

            if(add)result = result + (val(arr[i]));
            else{
                result = result + val(arr[i+1]) - val(arr[i]);
                if(i==arr.length-1)break;
                i++;
            }

            System.out.println("Result :" + result);
        }

        if(i != arr.length) {
            if(val(arr[i]) > val(arr[i-1])) add = false;
            else add = true;

            if (add) result = result + (val(arr[i]));
            else {
                result = result + val(arr[i]) - val(arr[i - 1]);
            }
        }

        System.out.println("----------------");
        System.out.println("Result :" + result);

        return result;

    }

    public static int val(String s){

        switch(s){
            case "I" : return 1;
            case "V" : return 5;
            case "X" : return 10;
            case "L" : return 50;
            case "C" : return 100;
            case "D" : return 500;
            case "M" : return 1000;
            default:return 0;
        }

    }
}
