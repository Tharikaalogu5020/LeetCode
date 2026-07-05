class Solution {

        public List<Integer> pathInZigZagTree(int label) {

                List<Integer> ans = new ArrayList<>();

                        while (label >= 1) {

                                    ans.add(label);

                                                int level = (int)(Math.log(label) / Math.log(2));

                                                            int start = 1 << level;
                                                                        int end = (1 << (level + 1)) - 1;

                                                                                    label = (start + end - label) / 2;
                                                                                            }

                                                                                                    Collections.reverse(ans);

                                                                                                            return ans;
                                                                                                                }
                                                                                                                }
