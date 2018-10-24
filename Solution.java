/**
 * Definition for a binary tree node.
 */
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode>  queue= new LinkedList<>();
        List<Integer> maxList=new ArrayList<>();
        if(root==null)
            return maxList;
        queue.add(root);
        while(!queue.isEmpty()){
            int max=Integer.MIN_VALUE,size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.remove();
                max=Math.max(curr.val,max);
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
            maxList.add(max);
        }
        return maxList;
    }
}
