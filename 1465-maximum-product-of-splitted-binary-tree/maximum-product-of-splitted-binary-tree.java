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

        long totalSum = 0;
            long maxProduct = 0;
                int MOD = 1000000007;

                    public int maxProduct(TreeNode root) {

                            totalSum = findSum(root);

                                    calculate(root);

                                            return (int)(maxProduct % MOD);
                                                }

                                                    // First DFS: Total Sum
                                                        private long findSum(TreeNode root) {

                                                                if (root == null)
                                                                            return 0;

                                                                                    return root.val + findSum(root.left) + findSum(root.right);
                                                                                        }

                                                                                            // Second DFS: Find Maximum Product
                                                                                                private long calculate(TreeNode root) {

                                                                                                        if (root == null)
                                                                                                                    return 0;

                                                                                                                            long left = calculate(root.left);
                                                                                                                                    long right = calculate(root.right);

                                                                                                                                            long sum = left + right + root.val;

                                                                                                                                                    maxProduct = Math.max(maxProduct,
                                                                                                                                                                                  sum * (totalSum - sum));

                                                                                                                                                                                          return sum;
                                                                                                                                                                                              }
                                                                                                                                                                                              }
