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
class CBTInserter {

        TreeNode root;
            Queue<TreeNode> queue = new LinkedList<>();

                public CBTInserter(TreeNode root) {

                        this.root = root;

                                Queue<TreeNode> bfs = new LinkedList<>();
                                        bfs.offer(root);

                                                while (!bfs.isEmpty()) {

                                                            TreeNode curr = bfs.poll();

                                                                        if (curr.left == null || curr.right == null)
                                                                                        queue.offer(curr);

                                                                                                    if (curr.left != null)
                                                                                                                    bfs.offer(curr.left);

                                                                                                                                if (curr.right != null)
                                                                                                                                                bfs.offer(curr.right);
                                                                                                                                                        }
                                                                                                                                                            }

                                                                                                                                                                public int insert(int val) {

                                                                                                                                                                        TreeNode parent = queue.peek();
                                                                                                                                                                                TreeNode node = new TreeNode(val);

                                                                                                                                                                                        if (parent.left == null) {

                                                                                                                                                                                                    parent.left = node;

                                                                                                                                                                                                            } else {

                                                                                                                                                                                                                        parent.right = node;
                                                                                                                                                                                                                                    queue.poll();
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                    queue.offer(node);

                                                                                                                                                                                                                                                            return parent.val;
                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                    public TreeNode get_root() {
                                                                                                                                                                                                                                                                            return root;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                /**
                                                                                                                                                                                                                                                                                 * Your CBTInserter object will be instantiat
}
/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */