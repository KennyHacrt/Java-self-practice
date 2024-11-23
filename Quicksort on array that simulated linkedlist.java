package comp2011.a2;

import java.util.Arrays;
import java.security.SecureRandom;


public class ListOnArray_23090099d_KennyLeeMingHin {
    private int[] data;
    int size;

    /*
     * The constructor is slightly different to Lab 5.
     * But the difference is irrevalent to the task.
     */
    public ListOnArray_23090099d_KennyLeeMingHin(int n) {
        size = (n + 1) << 1;
        data = new int[size];

        data[0] = 0; // may be omitted in Java.
        for (int i = 2; i < size - 2; i += 2)
            data[i] = i + 1;
        data[size - 1] = 1;
        data[size - 2] = 0;
    }

    public boolean isEmpty() {
        return data[0] == 0;
    }

    public boolean isFull() {
        return data[size - 1] == 0;
    }

    public void err() {
        System.out.println("Oops...");
    }

    /*
     * Insert a new element as the new head of the list.
     */
    public void insertFirst(int x) {
        if (isFull()) { err(); return; }
        int i = data[size - 1];
        data[size - 1] = data[i + 1];
        data[i + 1] = data[0];
        data[0] = i;
        data[i] = x;
    }

    /**
     * The *in-place* quicksort algorithm.
     *
     * VERY IMPORTANT.
     *
     * I've discussed this question with the following students:
     *     1.
     *     2.
     *     3.
     *     ...
     *
     * I've sought help from the following Internet resources and books:
     *     1.
     *     2.
     *     3.
     *     ...
     *
     * Running time: O( n^2 ).
     */
    public void quicksort() {
        if (data[0]==0) return;
        int count=0;
        int cur=data[0];
        int p_h=data[0];
        while (cur!=0){
            count++;
            p_h=cur;
            cur=next(cur);
        }
        int p_l=data[0];

        sort(p_l,p_h,count-1,true);
    }
    public void sort(int low,int high,int loop_no,boolean low_is_head){
        int count_l=0,count_r=0;
        int pivot=data[high];
        int p_l=high,p_h=high,p_m=high;
        int cur_ind;


        int high_next,low_previous;
        if(next(high)==0) high_next=0;
        else high_next=next(high);
        if(low_is_head) {
            low_previous=0;
            cur_ind=low;
        }
        else {
            low_previous=low;
            cur_ind=next(low);
        }

        if (cur_ind==high || loop_no<=0) return;
        for (int i=0;i<loop_no;i++){
            int temp= cur_ind;
//            System.out.println("temp = " +data[temp]);
            cur_ind=next(cur_ind);
//            System.out.println("current = " +data[cur_ind]);
            if (data[temp]>pivot){
//                System.out.println("p_h = " +data[p_h]);
                count_r++;
                data[p_h+1]=temp;
                p_h=temp;
            }
            else{
//                System.out.println("p_l = " +data[p_l]);
                count_l++;
                data[temp+1]=p_l;
//                System.out.println("data[temp+1] = " +data[data[temp+1]]);
                p_l=temp;
                if(count_l==1) p_m=temp;
            }
        }
        count_l--;
        count_r--;


        if (low_is_head) data[0]=p_l;
        else data[low_previous+1]=p_l;
        data[p_h+1]=high_next;

//        System.out.println("low = " + low + ", high = " + high + ", p_l = " + p_l + ", p_h = " + p_h);
//        System.out.println("Left count: " + count_l + ", Right count: " + count_r);
        sort(high,p_h,count_r,false);
        if (low_is_head) sort(data[0],p_m,count_l,true);
        else sort(low_previous,p_m,count_l,false);

    }
    public int next(int element_ind){
        return data[element_ind+1];
    }


    /*
     * Output the elements stored in the list in order.
     */
    public String toString() {
        if (isEmpty()) return "The list is empty.";
        StringBuilder sb = new StringBuilder();
        int i = data[0];
        sb.append(data[i++]);
        while (data[i] != 0) {
            i = data[i];
            sb.append(" -> ").append(data[i++]);
        }
        return sb.append('\u2193').toString();
    }

    /*
     * Todo: add at least ten more test cases to test your code.
     * Todo: modify the list (removing and adding elements) and sort it again.
     *
     * The use of data structures from Java libraries is allowed here and only here.
     */
    public static void main(String[] args) {
        int[][] testData = { // try different inputs.
                {},
                {1, 1, 1, 1, 1, 1, 1},
                {10, 8, -4, 89, 2, 0, 4, -19, 200},
                {5, 4, 3, 2, 1, 1, 0, 0, -1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8},
                {3, 2, 6, 13, 8, 4, 10, 7, 14, 11, 12, 5, 9},
                {65, 85, 17, 88, 66, 71, 45, 38, 95, 48, 18, 68, 60, 96, 55},
                {10, 8, 14, 89, 32, 50, 77, 38},

                {},
                {5},
                {7, 7, 7, 7, 7},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {1, 100, 2, 99, 3, 98},
                new int[1000],
                {-10, -5, 0, 5, 10},
                {0, 0, 0, 0},
                {-1000, 1000, -999, 999, -500, 500}
            };
        for (int[] a : testData) {
              int n = a.length;
              SecureRandom random = new SecureRandom();
              ListOnArray_23090099d_KennyLeeMingHin list = new ListOnArray_23090099d_KennyLeeMingHin(n + random.nextInt(1 + (n << 2)));  // you don't need to understand this line.
              System.out.println("The original array: " + Arrays.toString(a));
              for (int i = n - 1; i >= 0; i--) list.insertFirst(a[i]);
              System.out.println("The original list: " + list);
              // You can uncomment the following line to print out how the elements are stored
//               System.out.println("The internal storage: " + Arrays.toString(list.data));
              list.quicksort();
              System.out.println("The sorted list: " + list);
        }
  }
}
