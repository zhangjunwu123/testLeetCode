package 树;
/**
 *给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * 示例 1：
 * 输入：p = [1,2,3], q = [1,2,3]
 * 输出：true
 * 示例 2：
 * 输入：p = [1,2], q = [1,null,2]
 * 输出：false
 * */
public class 相同的树 {


    /**
     * DFS深度遍历，比较树的每个节点是否相同
     * */
    public boolean checkSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else if(p.val != q.val){
            return false;
        }else{
            return checkSameTree(p.left, q.left) && checkSameTree(p.right, q.right);
        }
    }
}
