public class CountAndSay2 {

    public static void main(String[] args) {

        int i = 5;
        String s = countAndSay(i);
        System.out.println(s);

    }

    public static String countAndSay(int n){


        String base = "1";

        for (int l = 1;l<n;l++){

            String[] arr = base.split("");
            
            String Result = "";

            int number= Integer.parseInt(arr[0]), count = 1, i;

            for(i=1;i< arr.length;i++){

                if(Integer.parseInt(arr[i])==number)count++;
                else{
                    Result = Result+ count+ number;
                    count=1;
                }
                number = Integer.parseInt(arr[i]);
            }
            Result = Result+ count+ number;
            base = Result;
        }

        return base;
    }

}
