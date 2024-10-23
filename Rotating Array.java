import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        int test[]={1,2,3,4,5,6,7};
        rotate_array(test,2);
        for (int i:test) System.out.println(i);
    }
    //Input a = [1,2,3,4,5,6,7],p = 2
    //Output [3,4,5,6,7,1,2]
    //Input a = [3,4,5],p = 4
    // Output [4,5,3]
    public static void rotate_array(int array[],int p){
        int filter;
        int len=array.length;
        if (p>len) filter=p-array.length;
        else filter=p;
        int temp[]=new int[filter];
        int i;
        for (i=0;i<filter;i++) temp[i]=array[i];
        for (i=0;i<len-filter;i++) array[i]=array[filter+i];
        for (i=0;i<filter;i++) array[len-filter+i]=temp[i];
    }
    

}

