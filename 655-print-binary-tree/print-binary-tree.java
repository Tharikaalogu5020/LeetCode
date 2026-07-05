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

        List<List<String>> res;
            int height;

                public List<List<String>> printTree(TreeNode root) {

                        height = getHeight(root);

                                int rows = height + 1;
                                        int cols = (1 << (height + 1)) - 1;

                                                res = new ArrayList<>();

                                                        for (int i = 0; i < rows; i++) {
                                                                    List<String> row = new ArrayList<>();
                                                                                for (int j = 0; j < cols; j++) {
                                                                                                row.add("");
                                                                                                            }
                                                                                                                        res.add(row);
                                                                                                                                }

                                                                                                                                        fill(root, 0, (cols - 1) / 2, height);

                                                                                                                                                return res;
                                                                                                                                                    }

                                                                                                                                                        private void fill(TreeNode node, int r, int c, int h) {

                                                                                                                                                                if (node == null)
                                                                                                                                                                            return;

                                                                                                                                                                                    res.get(r).set(c, String.valueOf(node.val));

                                                                                                                                                                                            int offset = 1 << (h - r - 1);

                                                                                                                                                                                                    fill(node.left, r + 1, c - offset, h);
                                                                                                                                                                                                            fill(node.right, r + 1, c + offset, h);
                                                                                                                                                                                                                }

                                                                                                                                                                                                                    private int getHeight(TreeNode node) {

                                                                                                                                                                                                                            if (node == null)
                                                                                                                                                                                                                                        return -1;

                                                                                                                                                                                                                                                return 1 + Math.max(getHeight(node.left), getHeight(node.right));
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    }
