package findingNemo;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int l = input.nextInt();
    public static int w = input.nextInt();
    public static char[][] dish = new char[l][w];
    
    public static int floodA(int x, int y, int linked, int hlink){
      boolean g = false;
      if (y-1 >= 0 && dish[x][y-1] == 'A') {
    	  g = true;
    	  floodA(x,y-1,linked+1,linked+1);
		}
      if (y+1 <= w && dish[y][x+1] == 'A') {
    	  g = true;
    	  floodA(x,y+1,linked+1,linked+1);
		}
      if (x-1 >= 0 && dish[x-1][y] == 'A') {
    	  g = true;
    	  floodA(x-1,y,linked+1,linked+1);
		}
      if (x+1 <= l && dish[x+1][y] == 'A') {
    	  g = true;
    	  floodA(x+1,y,linked+1,linked+1);
      }
      if (g == false){
    	  if (x+1 <= l)
    		  floodA(x+1,y,0,linked);
    	  if (x-1 >=0)
    		  floodA(x-1,y,0,linked);
    	  if (y+1 <= l)
    		  floodA(y+1,y,0,linked);
    	  if (y-1 >= 0)
    		  floodA(y-1,y,0,linked);
      }
      if (x == l-1 && y == w-1)
    	  return hlink;
      
      return 0;
    }
    
    public static void main(String[] args) {
      for(int i = 0; i < l; i++){
        String row = input.next().toUpperCase();
        for(int j = 0; j < w; j++)
          dish[i][j] = row.charAt(j);
      }
      
      for(int i = 0; i < l; i++){
        System.out.println();
        for (int j = 0; j < w; j++){
          System.out.print(dish[i][j]);
        }
      }
      
      System.out.println(floodA(0,0,0,0));

    }
}
 