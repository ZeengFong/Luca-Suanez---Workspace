public class Node {
    private Node up, down, left, right;
    private int c;

    public Node() {
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
        this.c = 0;
    }

    public Node getUp() {
        return up;
    }

    public void setUp(Node up) {
        this.up = up;
    }

    public Node getDown() {
        return down;
    }

    public void setDown(Node down) {
        this.down = down;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
}
