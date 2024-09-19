public class SELF_PRIME {
    public static void main(String[] args)
    {
        long startTime;
        long endTime;
        long elapsedTime;
        startTime= System.nanoTime();

        int n=20;
        boolean consecutive[]=new boolean[n+1];
        consecutive[0]=true;
        consecutive[1]=true;
        for (int i=0;i<n;i++)
        {
            if (consecutive[i]==false)
            {
                for (int p=i*2;p<n+1;p+=i)
                {
                    consecutive[p]=true;
                }
            }
        }

        endTime= System.nanoTime();
        elapsedTime=endTime-startTime;
        System.out.println(elapsedTime);
        for (int i=0;i<n;i++){
            if(!consecutive[i]) System.out.println(i);

        }

    }
}
