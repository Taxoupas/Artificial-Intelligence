public class TreeNode {

    public int value;
    public TreeNode[] children = new TreeNode[18];
    // its node in the array is a possible move

    public TreeNode(int val) {
        this.value = val;
    }

    public void expand_tree() { // a move has been decided , expanding tree
        int i = 0;
        while (i < 18) {
            children[i] = new TreeNode(i + 1);
            i++;
        }
    }

    // 1 : vert left (up)
    // 2 (down)
    // 3 : vert middle (up)
    // 4 (down)
    // 5 : vert right (up)
    // 6 (down)
    // 7 : horiz bottom (right)
    // 8 (left)
    // 9 : horiz middle (right)
    // 10 (left)
    // 11 : horiz top (right)
    // 12 (left)
    // 13 : behind behind (right)
    // 14 (left)
    // 15 : behind middle (right)
    // 16 (left)
    // 17 : behind front (right)
    // 18 (left)

}
