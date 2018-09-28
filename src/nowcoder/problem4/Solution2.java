package nowcoder.problem4;

public class Solution2 {
    //重建二叉树
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        //进入递归函数
        return reConstructTree(pre, 0, pre.length - 1, in, 0, in.length - 1);

    }

    public TreeNode reConstructTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        //判断是否结束递归
        if (startPre > endPre || startIn >endIn) {
            return null;
        }
        int rootValue = pre[startPre];
        TreeNode root = new TreeNode(rootValue);
        root.left = null;
        root.right = null;
        int indexIn = 0;
        //在中序遍历序列中找到根节点的位置
        for (int i = 0; i <= in.length; i++) {
            if (in[i] == rootValue) {
                indexIn = i;
                break;
            }
        }
        //左子树的结点个数
        int leftLength = indexIn - startIn;
        int leftPreEnd = startPre + leftLength;
        //递归左右子树
        root.left = reConstructTree(pre, startPre + 1, leftPreEnd, in, startIn, indexIn - 1);
        root.right = reConstructTree(pre, leftPreEnd + 1, endPre, in, indexIn + 1, endIn);
        return root;
    }
}