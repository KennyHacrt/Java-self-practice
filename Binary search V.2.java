public class binary_search {
    public static void main(String[] args) {
        int goal=6;
        int test[]= {0,1,2,3,4,5,6,7,8,9};
        int max=test.length-1;
        int min=0;
        int point;
        int ind=-1;
        while(max>=min){
            point=(max+min)/2;
            if (goal==test[point]) {
                ind=point;
                break;
            }
            else if (goal<test[point]){
                max=point-1;
            }
            else{
                min=point+1;
            }

        }
        System.out.println("index= "+ind);
    }
}