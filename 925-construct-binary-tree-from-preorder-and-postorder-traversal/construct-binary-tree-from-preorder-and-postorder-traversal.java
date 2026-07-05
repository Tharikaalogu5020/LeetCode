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

        int preIndex = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

                public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

                        for (int i = 0; i < postorder.length; i++) {
                                    map.put(postorder[i], i);
                                            }

                                                    return build(preorder, postorder, 0, postorder.length - 1);
                                                        }

                                                            private TreeNode build(int[] preorder, int[] postorder, int left, int right) {

                                                                    TreeNode root = new TreeNode(preorder[preIndex++]);

                                                                            if (left == right)
                                                                                        return root;

                                                                                                if (preIndex >= preorder.length)
                                                                                                            return root;

                                                                                                                    int index = map.get(preorder[preIndex]);

                                                                                                                            if (index <= right) {
                                                                                                                                        root.left = build(preorder, postorder, left, index);
                                                                                                                                                }

                                                                                                                                                        if (index + 1 <= right - 1) {
                                                                                                                                                                    root.right = build(preorder, postorder, index + 1, right - 1);
                                                                                                                                                                            }

                                                                                                                                                                                    return root;
                                                                                                                                                                                        }
                                                                                                                                                                                        }
