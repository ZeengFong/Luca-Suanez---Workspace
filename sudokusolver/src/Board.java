import java.io.File;
import java.util.Scanner;

public class Board{
	
	/*The Sudoku Board is made of 9x9 cells for a total of 81 cells.
	 * In this program we will be representing the Board using a 2D Array of cells.
	 * 
	 */

	private Cell[][] board = new Cell[9][9];
	
	//The variable "level" records the level of the puzzle being solved.
	private String level = "";

	
	///TODO: CONSTRUCTOR
	//This must initialize every cell on the board with a generic cell.  It must also assign all of the boxIDs to the cells
	public Board()	{
		for(int x = 0; x < 9; x++)
			for(int y = 0 ; y < 9; y++) {
				board[x][y] = new Cell();
				board[x][y].setBoxID(3*(x/3) + (y)/3+1);
			}
	}
	

	
	///TODO: loadPuzzle
	/*This method will take a single String as a parameter.  The String must be either "easy", "medium" or "hard"
	 * If it is none of these, the method will set the String to "easy".  The method will set each of the 9x9 grid
	 * of cells by accessing either "easyPuzzle.txt", "mediumPuzzle.txt" or "hardPuzzle.txt" and setting the Cell.number to 
	 * the number given in the file.  
	 * 
	 * This must also set the "level" variable
	 * TIP: Remember that setting a cell's number affects the other cells on the board.
	 */
	public void loadPuzzle(String level) throws Exception
	{
		this.level = level;
		String fileName = "easyPuzzle.txt";
		if(level.contentEquals("medium"))
			fileName = "mediumPuzzle.txt";
		else if(level.contentEquals("hard"))
			fileName = "hardPuzzle.txt";
    else if(level.contentEquals("oni"))
			fileName = "oniPuzzle.txt";
		
		Scanner input = new Scanner (new File(fileName));
		
		for(int x = 0; x < 9; x++)
			for(int y = 0 ; y < 9; y++)
			{
				int number = input.nextInt();
				if(number != 0)
					solve(x, y, number);
			}
						
		input.close();
		
	}
	
	/*This method scans the board and returns TRUE if every cell has been solved.  Otherwise it returns FALSE
	 * 
	 */
	public boolean isSolved()
	{
		for(int i = 0; i < 9; i++){
	      for(int j = 0; j < 9; j++){
	        if (board[i][j].getNumber() == 0)
	          return false;
	      }
	    }
    return true;
	}


	/*This method displays the board neatly to the screen.  Please see the sample output from the assignment to see the format required.
	 */
	public void display()
	{
		for (int i = 0; i < 9; i++){
      System.out.println();
      for (int j = 0; j < 9; j++)
        System.out.print(board[i][j].getNumber() + " ");
    }
	}
	
	///TODO: solve
	/*This method solves a single cell at x,y for number.  It also must adjust the potentials of the remaining cells in the same row,
	 * column, and box.
	 */
	public void solve(int x, int y, int number){
		board[x][y].setNumber(number);
		
	}
	
	
	//logicCycles() continuously cycles through the different logic algorithms until no more changes are being made.
	public void logicCycles()throws Exception
	{
		
		while(isSolved() == false)
		{
			int changesMade = 0;
			do
			{
				changesMade = 0;
				changesMade += logic1();
				changesMade += logic2();
				changesMade += logic3();
				changesMade += logic4();
				if(errorFound())
					break;
			}while(changesMade != 0);
	
		}			
		
	}
	
	
	/*This method searches each row of the puzzle and looks for cells that only have one potential.  If it finds a cell like this, it solves the cell 
	 * for that number. This also tracks the number of cells that it solved as it traversed the board and returns that number.
	 */
	public int logic1() {
		int changesMade = 0;
		for(int i = 0; i < 9; i++){
		     for(int j = 0; j < 9; j++){
		        	if (board[i][j].numberOfPotentials() == 1) {
		        		board[i][j].setNumber(board[i][j].getFirstPotential());
		        		changesMade++;
		        	}
		      }
		    }
		
		return changesMade;
					
	}
	
	///TODO: logic2
	/*This method searches each row for a cell that is the only cell that has the potential to be a given number.  If it finds such a cell and it
	 * is not already solved, it solves the cell.  It then does the same thing for the columns.This also tracks the number of cells that 
	 * it solved as it traversed the board and returns that number.
	 */
	
	public int logic2() {
		int changesMade = 0;
			
		return changesMade;
	}
	
	///TODO: logic3
	/*This method searches each box for a cell that is the only cell that has the potential to be a given number.  If it finds such a cell and it
	 * is not already solved, it solves the cell. This also tracks the number of cells that it solved as it traversed the board and returns that number.
	 */
	public int logic3() {
		int changesMade = 0;
		for(int i = 0; i < 7; i+=3){
			for(int j = 0; j < 7; j+=3){
				int[][][] boxPotentials = new int[9][1][1];
				for(int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						for()
					}
				}
			}
		}
		return changesMade;
	}
	
	
	///TODO: logic4
		/*This method searches each row for the following conditions:
		 * 1. There are two unsolved cells that only have two potential numbers that they can be
		 * 2. These two cells have the same two potentials (They can't be anything else)
		 * 
		 * Once this occurs, all of the other cells in the row cannot have these two potentials.  Write an algorithm to set these two potentials to be false
		 * for all other cells in the row.
		 * 
		 * Repeat this process for columns and rows.
		 * 
		 * This also tracks the number of cells that it solved as it traversed the board and returns that number.
		 */
	public int logic4()
	{
		int changesMade = 0;
		return changesMade;
	}
	
	
	///TODO: errorFound
	/*This method scans the board to see if any logical errors have been made.  It can detect this by looking for a cell that no longer has the potential to be 
	 * any number.
	 */
	public boolean errorFound() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j].numberOfPotentials() == 0)
					return true;
			}
		}
		return false;
	}
	
	
	
	
}
