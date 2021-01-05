public class CountAndSay{

    public static void main(String[] args) {

        int i = 5;
        String s = countAndSay(i);

    }

    public static String countAndSay(int n){

         //    1  ---> 11  ---> 2
        //    11 ---> 21 -----> 3
       //    21  ---> 1211 ----> 4
      //    1211 ----> 111221 ----> 5
     //    111221 ---> 312211 ----> 6

        String base = "111221", value="";
        int number=1, count = 1;
        String[] arr = base.split("");

        number = Integer.parseInt(arr[0]);
        int i;

        for(i=0;i< arr.length;i++){
            System.out.println("value in array : " + arr[i]);


            if(Integer.parseInt(arr[i]) == number){
                System.out.println("count " + count);
                count++;
            }
                number = Integer.parseInt(arr[i]);
                value = value + count + arr[i];
                System.out.println("value " + value);
                count = 1;
            }




        System.out.println("final number " + value);
        return base;
    }


}

