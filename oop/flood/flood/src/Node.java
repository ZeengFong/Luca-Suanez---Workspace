public class Node {
    private Node up, down, left, right;
    private String colorName;
    private String colorCode;

    public Node(String colorName, String colorCode) {
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
        this.colorName = colorName;
        this.colorCode = colorCode;
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

    public String getColorName() {
        return colorName;
    }

    public String getColorCode() {
        return colorCode;
    }
}
