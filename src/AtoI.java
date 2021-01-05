public class AtoI {

    public static void main(String[] args) {

        int a = myAtoi("00000-42a1234");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(a);
    }

    public static int myAtoi(String s) {

        // ignore whitespace
        // read numbers if string starts with integer
        // ignore if string starts with characters
        // corner case of 32 bit signed integer
        // convert string to integer
        // use substring methods to divide int and chars

        String[] arr = s.split("");
        String num = "";

        if(!checkIinit(arr[0]))return 0;
        if(arr.length == 1 && (arr[0].equals("+") || arr[0].equals("-")))return 0;
        for (int i=0; i<arr.length; i++){

            if(arr[i].equals(" ")){
                continue;
            }
            if(arr[i].equals(".")){
                break;
            }
            if(checkInt(arr[i])){
                num = num + arr[i];
            }
            System.out.println("num " + num);
        }
        //System.out.println("num " + num );
        if(num.contains("-+"))return 0;
        long number = Long.parseLong(num);

        System.out.println("number" + number);
        System.out.println("Integer.MIN_VALUE " +Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE " + Integer.MAX_VALUE);

        if(number > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(number < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else {
            return (int)number;
        }
    }

    public static boolean checkInt(String s){
        switch (s){
            case "0" :
            case "1" :
            case "2" :
            case "3" :
            case "4" :
            case "5" :
            case "6" :
            case "7" :
            case "8" :
            case "9" :
            case "-" :
            case "+" :
                return true;
            default: return false;

        }
    }
    public static boolean checkIinit(String s) {
        switch (s) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "-":
            case " ":
                return true;
            default:
                return false;

        }
    }
}
