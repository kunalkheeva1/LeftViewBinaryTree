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
        //get a list to be printd
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        //enter the levels one by one in the queue
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        //until the queue contains nothing
        while(!q.isEmpty()){
            int size = q.size();
            // but for the initial level
            for(int i= 0; i<size; i++){
                // get a root pointer
                TreeNode current = root;
                //add the value of 0th index element which is first from the left
                if(i ==0){
                    ans.add(current.val);
                }
                // and check the left and right of the current
                if(current.left != null) q.add(current.left);
                if(current.right  != null) q.add(current.right);
            }

        }return ans;

    }
    public static void main(String[] args) {

    }
}
