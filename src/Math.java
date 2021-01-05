public class Math {

    public static void main(String[] args) {

       System.out.println("Teja");
       String a ="teja";
        System.out.println(a);
        int d = 10;
        int b= 15;
        int c= 20;
        int z= d+b+c;
        System.out.println(z);

        z = 0;

        for(int i=1; i<20; i++){
            System.out.println("i" + i);
            System.out.println("z "+z);
            z = z+i;
            System.out.println("after addition z "+z);
            System.out.println();
        }
        System.out.println("z "+z);

    }
}
