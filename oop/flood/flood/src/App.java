import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        linkedGrid lg = new linkedGrid(20, 20);

        while (choice != 7) {
            int turn = 0;
            System.out.println("1. Red. 2. Yellow. 3. Purple\n4. Green 5. Blue 6. Cyan\n7. Exit\n");
            lg.printGrid();
            System.out.println("Turns: " + turn + "/25\nFlood: ");
            choice = input.nextInt();

            if (choice > 7 && choice < 1){
                lg.flood(choice);
            }
            else if (choice == 7){
                System.out.println("Exiting...");
                break;
            }


        input.close();
        }
    }
}