import java.util.ArrayList;

public class Path {
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(4);
        node.left.right=new TreeNode(5);
        node.right.left=new TreeNode(6);
        node.right.right=new TreeNode(7);
        ArrayList<Integer> res=solve(node, 5);
        System.out.println(res);
    }
    public static ArrayList<Integer> solve(TreeNode A, int B){
        ArrayList<Integer> al=new ArrayList<>();
        if(A==null){
            return al;
        }
        al= check(A, B, al);
        return al;

    }
    public static ArrayList<Integer> check(TreeNode A, int B, ArrayList<Integer> arr){
        arr.add(A.val);
        if(A.val==B){
            return arr;
        }
        if(A.left!=null){
            ArrayList<Integer> left=check(A.left, B, new ArrayList<>(arr));
            if(left.size()>0){
                return left;
            }
        }
        if(A.right!=null){
            ArrayList<Integer> right=check(A.right, B, new ArrayList<>(arr));
            if(right.size()>0){
                return right;
            }
        }
        return new ArrayList<>();


    }
}
