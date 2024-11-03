public class Main {
    public static void main(String[] args) {
        int testing[]={
                1, 4, 7,2, 5, 10, 12, 20
        };
        merge_sort(testing);
        for (int i:testing){
            System.out.println(i);
        }
//        //merging two parts in the same array
//        int tr[]={2,4,4,4,5,1,3,10,12,13};
//        merge1(tr);
//        for (int i:tr){
//            System.out.println(i);
//        }
//        //merging two sorted arrays into one sorted array
//        int test1[]={1, 4, 7};
//        int test2[]={2,5,10,12,20};
//        int huge[]=new int[test1.length+test2.length];
//        merge2(test1,test2,huge);
//        for (int i :huge){
//            System.out.println(i);
//        }
    }
    public static void merge2(int []test1,int[]test2, int[] upper){
        int index1=0;
        int index2=0;
        int tempind=0;
        while (index1<=test1.length-1 && index2<=test2.length-1){
            if (test1[index1]<test2[index2]) upper[tempind++]=test1[index1++];
            else upper[tempind++]=test2[index2++];

        }
        while (index1<=test1.length-1) upper[tempind++]=test1[index1++];
        while (index2<=test2.length-1) upper[tempind++]=test2[index2++];
    }
    public static void merge1(int []test1,int low,int high){
        int mid=low+(high-low)/2;
        int test2[]=new int[mid-low+1];
        for (int i=0;i< test2.length;i++){
            test2[i]=test1[low+i];
        }
        int index1=mid+1;
        int index2=0;
        int big=low;
        while (index1<=high && index2<test2.length){
            if (test1[index1]<test2[index2]) test1[big++]=test1[index1++];
            else test1[big++]=test2[index2++];

        }
        while (index2<test2.length) test1[big++]=test2[index2++];
    }
    public static void merge_sort(int []temp){
        merge_sort_in(temp,0,temp.length-1);
    }
    public static void merge_sort_in(int [] array,int left,int right ){
        if (right<=left) return;
        int mid= left+(right-left)/2;
        merge_sort_in(array,left,mid);
        merge_sort_in(array,mid+1,right);
        modified_merge1(array,left,mid,right);
    }
    public static void modified_merge1(int [] array,int low,int mid,int high) {
        int temp[] = new int[mid - low + 1];
        for (int i = 0; i < temp.length; i++) temp[i] = array[low + i];
        int array_index = mid+1, temp_index = 0 ,result_index=low;
        while (array_index <=high && temp_index <temp.length)
            array[result_index++]= temp[temp_index]>array[array_index]?array[array_index++]:temp[temp_index++];
        while (temp_index<temp.length) array[result_index++]=temp[temp_index++];
    }

}

