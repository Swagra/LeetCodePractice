/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String> al = new ArrayList<>();
    List<String> al1 = new ArrayList<>();
    void inorder(TreeNode node,List<String> al) {
        if(node==null){
            al.add("#");
             return ;}
         
        al.add(String.valueOf(node.val));
        inorder(node.left,al);
        inorder(node.right,al);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorder(p,al);
        inorder(q,al1);
        return (al.equals(al1));
    }
}