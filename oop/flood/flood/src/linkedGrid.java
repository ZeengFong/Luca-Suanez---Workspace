import java.util.Random;

public class linkedGrid {
    private Node root;
    private static final String[][] COLORS = {
        {"Red", "\u001B[41m"},
        {"Yellow", "\u001B[43m"},
        {"Purple", "\u001B[45m"},
        {"Green", "\u001B[42m"},
        {"Blue", "\u001B[44m"},
        {"Cyan", "\u001B[46m"}
    };
    private static final String RESET = "\u001B[0m";
    private Random random = new Random();

    public linkedGrid(int rows, int cols) {
        root = new Node(getRandomColorName(), getRandomColorCode());
        Node cm = root; // cm = column marker
        Node rm = root; // rm = row marker
        Node temp;

        for (int i = 0; i < cols - 1; i++) {
            temp = new Node(getRandomColorName(), getRandomColorCode());
            temp.setLeft(cm);
            cm.setRight(temp);
            cm = temp;
        }

        for (int j = 0; j < rows - 1; j++) {
            temp = new Node(getRandomColorName(), getRandomColorCode());
            rm.setDown(temp);
            temp.setUp(rm);
            cm = temp;
            rm = temp;

            for (int i = 0; i < cols - 1; i++) {
                temp = new Node(getRandomColorName(), getRandomColorCode());
                temp.setLeft(cm);
                cm.setRight(temp);
                temp.setUp(cm.getUp().getRight());
                cm.getUp().getRight().setDown(temp);
                cm = temp;
            }
        }
    }

    private String getRandomColorName() {
        return COLORS[random.nextInt(COLORS.length)][0];
    }

    private String getRandomColorCode() {
        return COLORS[random.nextInt(COLORS.length)][1];
    }

    public void printGrid() {
        Node temp = root;
        Node rm = root;
        while (temp != null) {
            rm = temp;
            while (temp != null) {
                System.out.print(temp.getColorCode() + "  " + RESET);
                temp = temp.getRight();
            }
            System.out.println();
            temp = rm.getDown();
        }
    }
}



















