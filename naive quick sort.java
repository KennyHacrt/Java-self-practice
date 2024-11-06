
public class Main {
    static int times=0;


    public static void main(String[] args) {
        int testing[]={
//                3, 9,1,2,2,7,4,3,6
//                1,2,3,4,5,6,7,8,9
//                9, 8, 7, 6, 5, 4, 3, 2, 1
//                5, 5, 5, 5, 5
//                3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5
                7
        };

//        System.out.println(times);
        quick_sort_input(testing);
        for (int i:testing){
            System.out.println(i);
        }
    }
    public static void quick_sort_input(int array[]){
        quick_sort(array,0,array.length-1);
    }
    public static void quick_sort(int array[],int low,int high){
        if(low>=high)return;
        int pivot = array[high];
        int temp[]=new int [high-low+1];
        int l_count=0,h_count=0;
        for (int i=0;i<temp.length;i++) temp[i]=array[low+i];
        for (int i=0;i<temp.length-1;i++) {
            if (temp[i]<=pivot) array[low+(l_count++)]=temp[i];
            else array[high-(h_count++)]=temp[i];
        }
        array[low+l_count]=temp[temp.length-1];
        quick_sort(array,low,low+l_count-1);
        quick_sort(array,low+l_count+1,high);
    }

}
