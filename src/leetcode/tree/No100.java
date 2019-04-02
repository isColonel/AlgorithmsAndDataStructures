package leetcode.tree;

import java.util.Stack;

/*
    给定两个二叉树，编写一个函数来检验它们是否相同。
    如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

    示例 1:
    输入:       1         1
              / \       / \
             2   3     2   3

           [1,2,3],   [1,2,3]
    输出: true

    示例 2:
    输入:      1          1
              /           \
             2             2

            [1,2],     [1,null,2]
    输出: false

    示例 3:
    输入:       1         1
              / \       / \
             2   1     1   2

            [1,2,1],   [1,1,2]
    输出: false
*/

public class No100 {

    //迭代实现
    public boolean isSameTreeByIteration(TreeNode p, TreeNode q) {
        Stack<TreeNode> s1=new Stack<TreeNode>(),s2=new Stack<TreeNode>();
        while(true){
            while(p!=null&&q!=null)
            {
                if(p.val!=q.val){
                    return false;
                }
                s1.push(p);
                p=p.left;
                s2.push(q);
                q=q.left;
            }
            if(p==null&&q!=null)
                return false;
            if(p!=null&&q==null)
                return false;
            if(s1.empty()&&s2.empty())
                return true;
            p=s1.pop();q=s2.pop();
            p=p.right;q=q.right;
        }
    }

    //递归实现
    public boolean isSameTreeByRecursion(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTreeByRecursion(p.left, q.left) && isSameTreeByRecursion(p.right, q.right);
    }

}
