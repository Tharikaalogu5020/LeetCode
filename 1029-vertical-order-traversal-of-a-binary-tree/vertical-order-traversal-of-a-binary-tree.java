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

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map =
                    new TreeMap<>();

                        public List<List<Integer>> verticalTraversal(TreeNode root) {

                                dfs(root, 0, 0);

                                        List<List<Integer>> ans = new ArrayList<>();

                                                for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

                                                            List<Integer> list = new ArrayList<>();

                                                                        for (PriorityQueue<Integer> pq : rows.values()) {

                                                                                        while (!pq.isEmpty()) {
                                                                                                            list.add(pq.poll());
                                                                                                                            }
                                                                                                                                        }

                                                                                                                                                    ans.add(list);
                                                                                                                                                            }

                                                                                                                                                                    return ans;
                                                                                                                                                                        }

                                                                                                                                                                            private void dfs(TreeNode node, int row, int col) {

                                                                                                                                                                                    if (node == null)
                                                                                                                                                                                                return;

                                                                                                                                                                                                        map.putIfAbsent(col, new TreeMap<>());

                                                                                                                                                                                                                map.get(col).putIfAbsent(row, new PriorityQueue<>());

                                                                                                                                                                                                                        map.get(col).get(row).offer(node.val);

                                                                                                                                                                                                                                dfs(node.left, row + 1, col - 1);

                                                                                                                                                                                                                                        dfs(node.right, row + 1, col + 1);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            }
