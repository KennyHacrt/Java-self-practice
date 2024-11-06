import com.sun.source.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
public class Binarytree<T>{
    public class Node <T>{
        T data;
        Node <T> left,right;
        Node(T data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public Node <T> root;
    public Binarytree(T data){
        root=new Node<T>(data);

    }

    public void inorder() {inorder(root);}
    public void inorder(Node <T> cur){
        if (cur==null) return;
        inorder(cur.left);
        System.out.println(cur.data);
        inorder(cur.right);
    }
    public void postorder() {postorder(root);}
    public void postorder(Node <T> cur){
        if (cur==null) return;
        postorder(cur.left);
        postorder(cur.right);
        System.out.println(cur.data);
    }
    public void preorder() {preorder(root);}
    public void preorder(Node <T> cur){
        if (cur==null) return;
        System.out.println(cur.data);
        preorder(cur.left);
        preorder(cur.right);
    }
    Queue <Node<T>> queue = new LinkedList<>();
    public void level_wise() {level_wise(root);}
    public void level_wise(Node <T> cur) {
        if (cur==null) return;
        System.out.println(cur.data);
        queue.poll();
        if (cur.left!=null)  queue.add(cur.left);
        if (cur.right!=null) queue.add(cur.right);
        if (queue.peek()!=null) {
            level_wise(queue.peek());
        }
    }
    
}

public class Main {
    static int times=0;
    public static void main(String[] args) {
//        int testing[]={
//                3, 9,1,2,2,7,4,3,6
////                1,2,3,4,5,6,7,8,9
////                9, 8, 7, 6, 5, 4, 3, 2, 1
////                5, 5, 5, 5, 5
////                3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5
////                7
//        };
//
////        System.out.println(times);
//
//        for (int i:testing){
//            System.out.println(i);
//        }
        Binarytree <Integer> test=new Binarytree<>(1);
        test.root.left=test.new Node<Integer>(2);
        test.root.right=test.new Node<Integer>(3);
        test.root.left.left=test.new Node<Integer>(4);
        test.root.left.right=test.new Node<Integer>(5);
        test.root.right.left=test.new Node<Integer>(6);
        test.root.right.right=test.new Node<Integer>(7);
        test.root.left.right.left=test.new Node<Integer>(8);
        test.root.left.right.right=test.new Node<Integer>(9);
        test.level_wise();
    }
    
}
