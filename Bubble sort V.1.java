import java.util.Random;

public class BuBBle {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long elapsedTime;
    //        case 1 random: 2250 ns
        int test[]= {5,1,2,3,0,9,8,6,7,4};
//            case 2 2267 ns:
//        int test[]= {9,8,7,6,5,4,3,2,1,0};
        //    case 3 1584 ns:
//        int test[]= {0,1,2,3,4,5,6,7,8,9};

//        Random rand=new Random();
//        int n=20;
//        int test[]=new int[n+1];
//        for (int i=0;i<n+1;i++){
//            test[i]=rand.nextInt(500000)+1000;
//
//        }
        startTime= System.nanoTime();
        int len= test.length;
        for (int i=0;i<len-1;i++)
        {
            int temp=0;
            for (int j=0;j<len-1-i;j++)
            {
                if (test[j]>test[j+1])
                {
                    temp=test[j+1];
                    test[j+1]=test[j];
                    test[j]=temp;

                }

            }
        }
        endTime= System.nanoTime();
        elapsedTime=endTime-startTime;
        System.out.println(elapsedTime);
//        for(int i : test ){
//            System.out.println(i);
//        }
    }
}
