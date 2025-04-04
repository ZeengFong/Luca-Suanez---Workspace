import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        linkedGrid lg = new linkedGrid(20, 20);

        while (choice != 7) {
            int turn = 0;
            System.out.println("1. Red. 2. Yellow. 3. Blue\n4. Cyan 5. Green 6. Purple\n7. Exit\n");
            lg.printGrid();
            System.out.println("Turns: " + turn + "/25\nFlood: ");
            choice = input.nextInt();

            if (choice == 1){

            }
            else if (choice == 2){

            }
            else if (choice == 3){

            }
            else if (choice == 4){

            }
            else if (choice == 5){

            }
            else if (choice == 6){

            }
            else if (choice == 7){
                System.out.println("Exiting...");
                break;
            }


        input.close();
        }
    }
}