public class TreeNode {
    public int value;
    public TreeNode[] children = new TreeNode[12];
    // its node in the array is a possible move

    public TreeNode(int val) {
        this.value = val;
    }

    public void expand_tree() { // a move has been decided , expanding tree
        int i = 0;
        while (i<12) {
            children[i] = new TreeNode(i+1);
            i++;
        }
    }



}
