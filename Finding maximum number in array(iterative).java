public class Main {
    public static void main(String[] args) {
        int test[]={12,35,1,10,1,19,49,34};
        System.out.println(max(test));
    }

    public static int max(int [] test){
        int count =test.length;
        int max ;
        while (count>1){

            for (int i=0; i<count/2 ;i++){
                if (test[i*2]<test[i*2+1]){
                    test[i]= test[i*2+1];
                }
                else{
                    test[i]=test[i*2];
                }
            }
            if (count%2==1){
                test[count/2]=test[count-1];
                count=count/2+1;
            }
            else count=count/2;
        }
        max=test[0];
        return max;
    }

}
