package nowcoder.problem4;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode treeNode = constructTree(pre, in, 0, pre.length-1, 0, in.length-1);
        print(treeNode);
        return treeNode;
    }

    private TreeNode constructTree(int[] pre, int[] in, int startPre, int endPre, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode newNode = new TreeNode(pre[startPre]);
        newNode.left = null;
        newNode.right = null;
        int indexIn = 0;
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                indexIn = i;
                break;
            }
        }

        int leftLength = indexIn - startIn;
        int leftPreEnd = startPre + leftLength;

        newNode.left = constructTree(pre, in, startPre + 1, leftPreEnd, startIn, indexIn - 1);
        newNode.right = constructTree(pre, in, leftPreEnd + 1, endPre, indexIn + 1, endIn);

        return newNode;
    }

    private void print(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.val);
        print(treeNode.left);
        print(treeNode.right);
    }
}