public class bracekt {
    public static void main(String[] args) {
//        String test="{[()]}";
//        String test="{()]";
//        String test="{[]([])[]}";
        String test="{(})";

        int len=test.length();
        char []brac=new char[3];
        int index=0;
        boolean check=true;
        for (int i=0;i<len;i++){
            if (test.charAt(i)=='(') {
                brac[index] = '(';
                index++;
            }
            else if (test.charAt(i)=='[') {
                brac[index] = '[';
                index++;
            }
            else if (test.charAt(i)=='{') {
                brac[index] = '{';
                index++;
            }
            else if (test.charAt(i)==')'&& brac[index-1]=='('){
                brac[index-1]='N';
                index--;
            }
            else if (test.charAt(i)==']'&& brac[index-1]=='['){
                brac[index-1]='N';
                index--;
            }
            else if (test.charAt(i)=='}'&& brac[index-1]=='{'){
                brac[index-1]='N';
                index--;
            }
            else{
                check=false;
                break;
            }

        }
        if (check) System.out.println("BALANCED");
        else System.out.println("UNBALANCED");

    }
}
/// using stack ver
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        int test[]={9,3,5,2,7,6,8,0,1,4};
        char test2[]={'(', '{', '[', '}', ')'};
//        bubble_recursive(test);
//        for (int i:test) System.out.println(i);
        System.out.println(balancing(test2));
    }
    //Input a = [1,2,3,4,5,6,7],p = 2
    //Output [3,4,5,6,7,1,2]
    //Input a = [3,4,5],p = 4
    // Output [4,5,3]
    public static void bubble_recursive(int test[]){
    }
    public static boolean balancing(char test2[]){
        Stack <Character> stack= new Stack <Character>();
        int count=0;
        int len =test2.length;
        if (len==0 || len%2==1) return false;
        for(int i=0;i<test2.length;i++){
            if (test2[i]=='(') {
                stack.push('(');
                count++;
            }
            else if (test2[i]=='[') {
                stack.push('[');
                count++;
            }
            else if (test2[i]=='{') {
                stack.push('{');
                count++;
            }
            else if (count!=0) {
                if (stack.peek() == '(' && test2[i] == ')') {
                    stack.pop();
                    count--;
                } else if (stack.peek() == '[' && test2[i] == ']') {
                    stack.pop();
                    count--;
                } else if (stack.peek() == '{' && test2[i] == '}') {
                    stack.pop();
                    count--;
                }
                else return false;
            }
            else return false;

        }
        if (stack.isEmpty()) return true;
        return false;
    }

}

