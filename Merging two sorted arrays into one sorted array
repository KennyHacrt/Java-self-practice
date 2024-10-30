public class Main {
    public static void main(String[] args) {
        int test1[]={1, 4, 7};
        int test2[]={2,5,10,12,20};
        for (int i :merge(test1,test2)){
            System.out.println(i);
        }
    }
    public static int[] merge(int []test1,int[]test2){
        int temp[]=new int[test1.length+test2.length];
        int index1=0;
        int index2=0;
        int tempind=0;
        while (index1<=test1.length-1 && index2<=test2.length-1){
            if (test1[index1]<test2[index2]){
                temp[tempind++]=test1[index1++];
            }
            else{
                temp[tempind++]=test2[index2++];
            }

        }
        while (index1<=test1.length-1){
            temp[tempind++]=test1[index1++];
        }
        while (index2<=test2.length-1){
            temp[tempind++]=test2[index2++];
        }
        return temp;
    }
}
