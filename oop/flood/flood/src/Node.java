public class Node {
    private Node up, down, left, right;
    private String colourName;
    private String colourCode;

    public Node(String colourName, String colourCode) {
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
        this.colourName = colourName;
        this.colourCode = colourCode;
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

    public void setColourName(String colourName) {
        this.colourName = colourName;
    }

    public void setColourCode(String colourCode) {
        this.colourCode = colourCode;
    }

    public String getColourName() {
        return colourName;
    }

    public String getColourCode() {
        return colourCode;
    }

}
