public class Node {
    private Node up, down, left, right;
    private int data;

    public Node(int data){
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
        this.data = 0;
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
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }    
}
