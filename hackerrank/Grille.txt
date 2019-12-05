import java.util.*;
public class Grille {
	static int place=0;
	static int holes=0; 
	static int size;
	static char[][] grid; 
	
	public static void main(String[] args) {
		Initialize();
		Rotate();
	}
	
	public static void Initialize() {
		Scanner input = new Scanner(System.in);
		size = input.nextInt();
		grid = new char[size][size];
		for (int i=0; i<size; i++) {
			String temp = input.next();
			for (int j=0; j<size; j++) {
				grid[i][j] = temp.charAt(j);
			}
		}
	}
	
	public static void GetNumberOfHoles(char[][] grid) {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (grid[i][j] == '.'){
					holes++;
				}
			}
		}
		char convert = '3';
		
		int parse = Integer.parseInt(String.valueOf(convert));
		
	}
	
	public static void Rotate() {
		double origin = size/2;
		//so just add the origin to each coordinate each time
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) { 
				double x = i-origin;
				double y = j-origin;
				if (x>0 && y>0) { 
					double temp = i; 
					//Swap x and y
					x=y*(-1);
					y=temp*(-1);
					//subtract origin to get back to normal coordinates
					int newX = (int) (x-origin);
					int newY = (int) (y-origin);
					grid[i][j] = grid[newX][newY];
					//negate both
				}
				else if ((i+origin)>0 && (j+origin)<0) {
					double temp = i; 
					x=j;
					y=temp*(-1);
					//subtract origin to get back to normal coordinates
					int newX = (int) (x-origin);
					int newY = (int) (y-origin);
					grid[i][j] = grid[newX][newY];
					//negate both
				}
				else if ((i+origin)<0 && (j+origin)<0) {
					double temp = i; 
					x=j*(-1);
					y=temp;
					//subtract origin to get back to normal coordinates
					int newX = (int) (x-origin);
					int newY = (int) (y-origin);
					grid[i][j] = grid[newX][newY];
					//negate both
				}
				else {
					double temp = i; 
					x=j*(-1);
					y=temp;
					//subtract origin to get back to normal coordinates
					int newX = (int) (x-origin);
					int newY = (int) (y-origin);
					grid[i][j] = grid[newX][newY];
					//negate both
				} 
			}
		}
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int ToInt(char ch) {
		return Integer.parseInt(String.valueOf(ch));
	}
}

/*
	for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	
	4
	XX.X
	X.X.
	XXXX
	.XXX
	noeesrksdmnyemoj
	
		
	
	2, 1
	-1, -2
	-2, 1
	-1, 2
	
	
	
	
	
*/