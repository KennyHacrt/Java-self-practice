
public class Main {
    public static void main(String[] args) {
        int test=4;
        int n=3,m=3;
        int left=6,right=4,count=0,total;
//        int test_a[]={9,8,5,6,7,3,2,1,4,0};
        int test_a[]={1, 2, 4, 4, 4, 5, 6, 7};
//        System.out.println(sum(test));
//        System.out.println(finding_paths(n,m));

//        System.out.println(partition(left,right));
        selection(test_a);
        System.out.println(modified_binary_search_recursive(test_a,4,0,test_a.length-1,-1));
//        System.out.println(fibonacci_recursive(7));
//        for(int i: test_a){
////            System.out.println(i);
//            System.out.println(binary_search(test_a,i));
//        }
//        System.out.println(recursive_GCD(12,8));

    }
    public static int sum(int test){
        if (test==0) return 0;
        return test+sum(test-1);
    }
    public static int finding_paths(int n,int m){
        if(n==1 || m==1) return 1;
        return finding_paths(n-1,m)+finding_paths(n,m-1);
    }
    public static void insertion(int [] n){
        int len=n.length;
        int i,j,store;
        for (i=1;i<len;i++){
            store=n[i];
            for (j=i-1;j>=0;j--){
                if (store>=n[j]) break;
                n[j+1]=n[j];
            }
            n[j+1]=store;
        }
    }
    public static void selection(int [] n){
        int len=n.length;
        int i,j,min,temp;
        for (i=0;i<len-1;i++){
            min=i;
            for (j=i+1;j<len;j++){
                if (n[min]>n[j]) min=j;
            }
            temp=n[min];
            n[min]=n[i];
            n[i]=temp;
        }
    }
    public static void bubble(int [] n){
        int len= n.length;
        int i,j,temp;
        boolean flag;
        for(i=0;i<len-1;i++) {
            flag = false;
            for (j = 0; j < len - 1 - i; j++)
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                    flag = true;
                }
            if (!flag) break;
        }
    }
    public static int binary_search(int [] n,int aim){
        int len=n.length;
        int mid,left=0,right=len-1;
        while (left<=right){
            mid=(left+right)/2;
            if (n[mid]==aim) return mid;
            else if (n[mid]>aim) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
    public static int binary_search_recursive(int [] n,int aim,int left,int right){
        int mid=(left+right)/2;
        if (left>right) return -1;
        else if (n[mid]==aim) return mid;
        else if (n[mid]<aim)  return binary_search_recursive(n,aim,mid+1,right);
        return binary_search_recursive(n,aim,left,mid-1);
    }
// if two elements are the same return the one's index with smaller index
    public static int modified_binary_search_recursive(int [] n,int aim,int left,int right,int smallest){
        int mid=(left+right)/2;
        if (left>right) return smallest;
        else if (n[mid]==aim) {
            smallest=mid;
            return modified_binary_search_recursive(n,aim,left,mid-1,smallest);
        }
        else if (n[mid]<aim)  return modified_binary_search_recursive(n,aim,mid+1,right,smallest);
        return modified_binary_search_recursive(n,aim,left,mid-1,smallest);
    }

    public static int fibonacci_recursive(int times){
        if (times==0) return 0;
        if (times==1) return 1;
        return fibonacci_recursive(times-1)+fibonacci_recursive(times-2);
    }

    public static int iterative_GCD(int a, int b){
        if (b<a) return iterative_GCD(b,a);
        int original_b=b;
        int original_a=a;
        int temp;
        while(b%a!=1){
            temp=a;
            a=b%a;
            b=temp;
            if (a==0) return b;
        }
        return -1;
    }
    public static int recursive_GCD(int a, int b){
        if (b<a) return iterative_GCD(b,a);
        if (a==1) return -1;
        if (a==0) return b;
        return recursive_GCD(b%a,a);
    }

    

}
