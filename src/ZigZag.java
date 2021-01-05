public class ZigZag {

    public static void main(String[] args) {
        String result = convert("paypalishiring",4);
        //System.out.println(result);
    }
    public static String convert(String s, int numRows) {

        if(numRows == 1)return s;
        else {

            String[] sets = new String[numRows];

            String[] arr = s.split("");

            for (int i = 0; i < numRows; i++) {
                sets[i] = "";
            }
            int pos = 0;
            boolean incr = true;
            for (int i = 0; i < arr.length; i++) {

                if (pos == 0) incr = true;
                else if (pos == numRows - 1) incr = false;

                sets[pos] = sets[pos] + arr[i];
                System.out.println("sets[" + pos + "] -" + sets[pos]);

                if (incr) pos++;
                else pos--;
            }

            System.out.println("--------------------------");
            String Result = "";
            for (int i = 0; i < numRows; i++) {
                System.out.println("sets["+ i+ "] " + sets[i]);
                Result = Result + sets[i];

            }

            System.out.println("Result " + Result);
            return Result;

        }
    }
}
