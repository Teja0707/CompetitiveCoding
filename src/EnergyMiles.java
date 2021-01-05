import java.util.Scanner;

public class EnergyMiles {

    public static void main(String[] args) {
        int t;

        int m,e;

        Scanner s = new Scanner(System.in);

        t = s.nextInt();

        for(int i=0;i<t;i++){
            m = s.nextInt();
            e = s.nextInt();
            reach(m,e);

        }


    }

    private static void reach(int miles, int energy) {
        int walkTime = 0;
        int totalTime = 0;

        while(walkTime < miles){
            if(energy > -1){
                energy = energy-1;
                walkTime++;
            }
            else energy=2;
            totalTime++;
        }
        System.out.println("total time : " + totalTime + " energy : " + energy);

    }
}
