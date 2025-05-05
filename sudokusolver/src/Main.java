import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws Exception {
		
		Board puzzle = new Board();
		puzzle.loadPuzzle("easy");
		puzzle.display();
		puzzle.logicCycles();
		puzzle.display();
		System.out.println(puzzle.errorFound());
		System.out.println(puzzle.isSolved());
		

	}

}
 