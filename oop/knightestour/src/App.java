import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dimensions = 0;
        int counter = 1;
        System.out.println("How large the domain shall your Knight tour?\n");
        dimensions = input.nextInt();
        linkedGrid lg = new linkedGrid(dimensions, dimensions);
        lg.tour(lg.getRoot(), counter);
        input.close();
    }
}
