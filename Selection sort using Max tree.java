package comp2011.a2;

import java.util.Arrays;

/**
 * 
 * @author Yixin Cao (November 4, 2024)
 *
 * Use a maximum tree (introduced in Lecture 6) to sort an array.
 * 
 */
public class MaxTree_23090099d_KennyLeeMingHin { // Please change!

    /*
     * No modification to the class {@code Node} is allowed.
     * If you change anything in this class, your work will not be graded.
     */
    private class Node {
        int element;
        public Node leftChild, rightChild;
        public Node(int element) { this.element = element; }
        public String toString() { return String.valueOf(element); }
    }
    Node root;
    
    /**
     * The constructor: Build a maximum tree out of an array.
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
     * Running time: O( nlog(n) ).
     */
    public MaxTree_23090099d_KennyLeeMingHin(int[] a) {
        max(a,0,a.length-1);
    }
    public Node max(int[] b , int low, int high){
        if(low==high) return new Node(b[low]);
        if(low>high) return null;
        int mid =low +(high-low)/2;
        Node left = max(b,low,mid);
        Node right = max(b,mid+1,high);
        if (left.element>=right.element){
            Node max= new Node(left.element);
            max.leftChild=left;
            max.rightChild=right;
            root=max;
            return max;
        }
        else{
            Node max= new Node(right.element);
            max.leftChild=left;
            max.rightChild=right;
            root=max;
            return max;
        }
    }
    /**
     * Remove the root from a maximum tree and return its element.
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
     * Running time: O( logn ).
     */
    public int removeMax() {
        int max_num=root.element;
        remove();
        return max_num;
    }
    public void remove() {
        int tree_depth=0;
        Node current=root;
        while (current.leftChild!=null){
            tree_depth++;
            current=current.leftChild;
        }
        Node stack[]=new Node[tree_depth];

        Node cur=root;
        int stack_ind=0;
        while (cur.leftChild!=null){
            stack[stack_ind++]=cur;
            if (cur.element==cur.leftChild.element) {
                cur=cur.leftChild;
            }
            else {
                cur=cur.rightChild;
            }
        }
        cur.element=Integer.MIN_VALUE;

        for (int i=stack_ind-1;i>=0;i--){
            if (stack[i].rightChild!=null) {
                if (stack[i].leftChild.element > stack[i].rightChild.element)
                    stack[i].element = stack[i].leftChild.element;
                else stack[i].element = stack[i].rightChild.element;
            }
            else stack[i].element = stack[i].leftChild.element;
        }

    }

    /**
     * The *smart* selection sort.
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
     * Running time: O( nlogn ); space use: O( n ).
     */
    public static void treeSort(int[] a) {
        if (a.length==1) return;
        MaxTree_23090099d_KennyLeeMingHin t = new MaxTree_23090099d_KennyLeeMingHin(a);
        for (int i=a.length-1; i>=0; i--){
            a[i]=t.removeMax();

        }

    }

    /*
     * Todo: add at least ten more test cases to test your code.
     * The use of data structures from Java libraries is allowed here and only here.
     */
    public static void main(String[] args) {
        int testData[][] = { // try different inputs.
                {},
                {1, 1, 1, 1, 1, 1, 1},
                {10, 8, -4, 89, 2, 0, 4, -19, 200},
                {5, 4, 3, 2, 1, 1, 0, 0, -1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8},
                {3, 2, 6, 13, 8, 4, 10, 7, 14, 11, 12, 5, 9},
                {65, 85, 17, 88, 66, 71, 45, 38, 95, 48, 18, 68, 60, 96, 55},
                {10, 8, 14, 89, 32, 50, 77, 38},

                {42},
                {-5, -10, -3, -7},
                {Integer.MAX_VALUE, Integer.MIN_VALUE, 0},
                {1, 1000, 2, 999, 3, 998},
                {100, 50, 99, 25, 98, 45, 75},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {},
                {1, 1000000, 2, 999999, 3, 999998},
                {5, 3, 8, 3, 1, 9, 9, 4, 8}
            };
        for (int[] a:testData) {
            System.out.println("The original array: " + Arrays.toString(a));
            treeSort(a);
            System.out.println("Sorted: " + Arrays.toString(a));
        }
    }
}
