import java.util.Random;
public class Simulation_of_pi {
    public static void main(String[] args)
    {
        int n=1000;
        int circle_a=0;
        Random rand=new Random();
        for(int i=0;i<n;i++)
        {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            if (distance<=1){
                circle_a++;
            }
        }

        System.out.println(4.0*circle_a/n);

    }
}
