package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution94 {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null) {
            stack.offerFirst(root);
            root = root.left;
        }
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pollFirst();
            res.add(temp.val);
            temp = temp.right;
            while (temp != null) {
                stack.offerFirst(temp);
                temp = temp.left;
            }
        }

        return res;
    }
}
