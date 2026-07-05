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

        List<Integer> list = new ArrayList<>();

            // Inorder Traversal
                public void inorder(TreeNode root) {
                        if (root == null)
                                    return;

                                            inorder(root.left);
                                                    list.add(root.val);
                                                            inorder(root.right);
                                                                }

                                                                    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {

                                                                            inorder(root);

                                                                                    List<List<Integer>> ans = new ArrayList<>();

                                                                                            for (int q : queries) {

                                                                                                        int floor = -1;
                                                                                                                    int ceil = -1;

                                                                                                                                int left = 0;
                                                                                                                                            int right = list.size() - 1;

                                                                                                                                                        // Binary Search
                                                                                                                                                                    while (left <= right) {

                                                                                                                                                                                    int mid = left + (right - left) / 2;

                                                                                                                                                                                                    if (list.get(mid) == q) {
                                                                                                                                                                                                                        floor = q;
                                                                                                                                                                                                                                            ceil = q;
                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                else if (list.get(mid) < q) {
                                                                                                                                                                                                                                                                                                                    floor = list.get(mid);
                                                                                                                                                                                                                                                                                                                                        left = mid + 1;
                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        else {
                                                                                                                                                                                                                                                                                                                                                                                            ceil = list.get(mid);
                                                                                                                                                                                                                                                                                                                                                                                                                right = mid - 1;
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                                                                                        ans.add(Arrays.asList(floor, ceil));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                                                                                                                                        return ans;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
