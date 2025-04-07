import java.util.Random;

public class linkedGrid {
    private Node root;
    private static String[][] COLOURS = {
        {"Red", "\u001B[41m"},
        {"Yellow", "\u001B[43m"},
        {"Purple", "\u001B[45m"},
        {"Green", "\u001B[42m"},
        {"Blue", "\u001B[44m"},
        {"Cyan", "\u001B[46m"}
    };
    private static String RESET = "\u001B[0m";
    private Random random = new Random();

    public linkedGrid(int rows, int cols) {
        root = new Node(getRandomColourName(), getRandomColourCode());
        Node cm = root; // cm = column marker
        Node rm = root; // rm = row marker
        Node temp;

        for (int i = 0; i < cols - 1; i++) {
            temp = new Node(getRandomColourName(), getRandomColourCode());
            temp.setLeft(cm);
            cm.setRight(temp);
            cm = temp;
        }

        for (int j = 0; j < rows - 1; j++) {
            temp = new Node(getRandomColourName(), getRandomColourCode());
            rm.setDown(temp);
            temp.setUp(rm);
            cm = temp;
            rm = temp;

            for (int i = 0; i < cols - 1; i++) {
                temp = new Node(getRandomColourName(), getRandomColourCode());
                temp.setLeft(cm);
                cm.setRight(temp);
                temp.setUp(cm.getUp().getRight());
                cm.getUp().getRight().setDown(temp);
                cm = temp;
            }
        }
    }

    private String getRandomColourName() {
        return COLOURS[random.nextInt(COLOURS.length)][0];
    }

    private String getRandomColourCode() {
        return COLOURS[random.nextInt(COLOURS.length)][1];
    }
    

    public void printGrid() {
        Node temp = root;
        Node rm = root;
        while (temp != null) {
            rm = temp;
            while (temp != null) {
                System.out.print(temp.getColourCode() + "  " + RESET);
                temp = temp.getRight();
            }
            System.out.println();
            temp = rm.getDown();
        }
    }

    public void setColour(Node n, int colour){
        if (colour == 1){
            n.setColourName("Red");
            n.setColourCode("\u001B[41m");
        } else if (colour == 2) {
            n.setColourName("Yellow");
            n.setColourCode("\u001B[43m");
        } else if (colour == 3) {
            n.setColourName("Blue");
            n.setColourCode("\u001B[44m");
        } else if (colour == 4) {
            n.setColourName("Cyan");
            n.setColourCode("\u001B[46m");
        } else if (colour == 5) {
            n.setColourName("Green");
            n.setColourCode("\u001B[42m");
        } else if (colour == 6) {
            n.setColourName("Purple");
            n.setColourCode("\u001B[45m");
        }
    }

    public void flood (Node n, int colour){
        if (n == null) return;
        if (n.getUp() != null && n.getUp().getColourName() == n.getColourName()){
            setColour(n, colour);
        }
    }

    public void flood(int colour){
        flood(root, colour);
    }
}



















