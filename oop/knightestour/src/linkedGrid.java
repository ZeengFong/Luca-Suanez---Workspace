public class linkedGrid {
    private Node root;
    private int dimensions;

    public linkedGrid(int rows, int cols) {
        dimensions = rows * cols;
        root = new Node();
        Node cm = root; // cm = column marker
        Node rm = root; // rm = row marker
        Node temp;

        for (int i = 0; i < cols - 1; i++) {
            temp = new Node();
            temp.setLeft(cm);
            temp.setC(0);
            cm.setRight(temp);
            cm = temp;
        }

        for (int j = 0; j < rows - 1; j++) {
            temp = new Node();
            rm.setDown(temp);
            temp.setUp(rm);
            cm = temp;
            rm = temp;

            for (int i = 0; i < cols - 1; i++) {
                temp = new Node();
                temp.setLeft(cm);
                cm.setRight(temp);
                temp.setUp(cm.getUp().getRight());
                cm.getUp().getRight().setDown(temp);
                cm = temp;
            }
        }
    }

    public Node getRoot() {
        return root;
    }
    

    public void printGrid() {
        Node temp = root;
        Node rm = root;
        while (temp != null) {
            rm = temp;
            while (temp != null) {
                System.out.print(temp.getC());
                temp = temp.getRight();
            }
            System.out.println();
            temp = rm.getDown();
        }
    }

    public Node move(int move, Node n){
        if (move == 1){
            try{return n.getUp().getUp().getRight();}
            catch (NullPointerException e){return null;}
        }
        else if (move == 2){
            try{return n.getUp().getRight().getRight();}
            catch (NullPointerException e){return null;}
        }
        else if (move == 3){
            try {return n.getDown().getRight().getRight();}
            catch (NullPointerException e){return null;}
        }
        else if (move == 4){
            try {return n.getDown().getDown().getRight();}
            catch (NullPointerException e){return null;}
        }
        else if (move == 5){
            try{return n.getDown().getDown().getLeft();}
            catch (NullPointerException e){return null;}
        }
        else if (move == 6){
            try {return n.getDown().getLeft().getLeft();}
            catch (NullPointerException e){return null;}
        }
        else if (move == 7){
            try {return n.getUp().getLeft().getLeft();}
            catch (NullPointerException e){return null;}
        }
        else if (move == 8){
           try {return n.getUp().getUp().getLeft();}
           catch (NullPointerException e){return null;}
        }
        else
            return null;
    }

    public Node backtrack(Node n){
        int i = 1;
        while(move(i,n).getC() != n.getC()-1){
            i++;
            continue;
        }
        Node temp = move(i, n);
        n.setC(0);
        return temp;
    }

    public void tour(Node n, int counter){

        n.setC(counter);
        if( (n.getUp() != null) && (n.getUp().getUp() != null) && (n.getUp().getUp().getLeft() != null) && n.getUp().getUp().getLeft().getC() == 0){
            tour(n.getUp().getUp().getLeft(), counter+1);
        }


        n.setC(0);





        /* 
        n.setC(counter);
        counter = counter+1;
        int nullcounter = 0;
        for(int i = 1; i <= 8; i++){
            Node temp = move(i, n);
            if (temp != null && temp.getC() == 0){
                tour(temp, counter);
            }
            else if (temp == null){
                nullcounter = nullcounter + 1;
            }
        }
        if (nullcounter == 8){
            n = backtrack(n);
            counter = counter - 1;
        }
        if (n.getC() == dimensions*dimensions){
            System.out.println("Tour found!");
            printGrid();
            return;
        }
            */
    }

}



















