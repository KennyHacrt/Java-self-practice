public class Main {
    static int times=0;
    public static void main(String[] args) {
        int testing[]={
                3, 9,1,2,2,7,4,3,6
//                1,2,3,4,5,6,7,8,9
        };
//        merge_sort(testing);
//        bubble_input(testing);
//        insertion_input(testing);
        selection_input(testing);
//        System.out.println(times);
        for (int i:testing){
            System.out.println(i);
        }
    }

    public static void bubble_input(int []array){
        recursive_bubble(array, array.length-1);
    }
    public static void recursive_bubble(int []array,int len){
        times++;
        if (len==0) return;
        int temp;
        boolean flag=true;
        for (int i=0;i< len ;i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                flag=false;
            }
        }
        if(flag) return;
        recursive_bubble(array,len-1);
    }
    public static void insertion_input(int []array){
        recursive_insertion(array, array.length);
    }
    public static void recursive_insertion(int []array,int len){
        times++;
        if (len<=1) return;
        recursive_insertion(array,len-1);
        int temp;
        for(int i=len-1; i>=1 && array[i]<array[i-1];i--){
            temp=array[i];
            array[i]=array[i-1];
            array[i-1]=temp;
        }
    }
    public static void selection_input(int []array){
        recursive_selection(array, 0);
    }
    public static void recursive_selection(int []array,int start){
        if (start==array.length-1) return;
        int temp=array[start],index=start;
        for (int i=start;i< array.length;i++){
            if (temp>array[i]){
                temp=array[i];
                index=i;
            }
        }
        array[index]=array[start];
        array[start]=temp;
        recursive_selection(array,start+1);
    }
}

