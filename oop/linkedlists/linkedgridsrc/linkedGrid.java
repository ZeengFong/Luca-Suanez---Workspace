public class linkedGrid {
    private Node root;

    public linkedGrid(int rows, int cols) {

        int count = 1;
        root = new Node(count++);
        Node cm = root; //cm = column marker
        Node rm = root; // rm = row marker
        Node temp;

        for (int i = 0; i < cols-1; i++) {
            temp = new Node(count++);
            temp.setLeft(cm);
            cm.setRight(temp);
            cm = temp;
        }

        for (int j = 0; j < rows-1; j++){
            temp = new Node(count++);
            rm.setDown(temp);
            temp.setUp(rm);
            cm = temp;
            rm = temp;

            for (int i = 0; i < cols-1; i++){
                temp = new Node(count++);
                temp.setLeft(cm);
                cm.setRight(temp);
                temp.setUp(cm.getUp().getRight());
                cm.getUp().getRight().setDown(temp);
                cm = temp;
            }
        }
    }

    public void printGrid() {
        Node temp = root;
        Node rm = root;
        while (temp != null){
            rm = temp;
        while(temp != null) {
            System.out.printf("%4d", temp.getData());
            temp = temp.getRight();
        }
        System.out.println();
        temp = rm.getDown();
    }
    }
}



















