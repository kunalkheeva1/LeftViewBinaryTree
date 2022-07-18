import java.util.*;


public class LeftViewBinaryTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> leftViewBinaryTree(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i= 0; i<size; i++){
                TreeNode current = root;
                if(i ==0){
                    ans.add(current.val);
                }
                if(current.left != null) q.add(current.left);
                if(current.right  != null) q.add(current.right);
            }

        }return ans

    }
    public static void main(String[] args) {

    }
}
