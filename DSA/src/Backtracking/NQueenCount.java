package Backtracking;

public class NQueenCount {
	
	public static boolean isSafePlace(boolean chessboard[][], int row, int col)
	{
		for(int i = row; i>=0; i--)
		{
			if(chessboard[i][col])
			{
				return false;
			}
		}
		
		for(int i = row, j = col; i>=0 && j >= 0; i--,j--)
		{
			if(chessboard[i][j])
			{
				return false;
			}
		}
		
		for(int i = row, j = col; i>=0 && j < chessboard.length; i--,j++)
		{
			if(chessboard[i][j])
			{
				return false;
			}
		}
		
		return true;
	}
	
	
	public static int countQueenPlacement(boolean chessboard[][], int currentRow)
	{
		int count = 0;
		
		//base case
		if(currentRow == chessboard.length)
		{
			return 1;
		}
		
		//current row and traverse all the cells
		for(int col = 0; col < chessboard[currentRow].length; col++)
		{
			//before placing queen, just check for row wise, col wise and diagonal wise
			
			if(isSafePlace(chessboard, currentRow, col))
			{
				chessboard[currentRow][col] = true; //queen place
				count = count + countQueenPlacement(chessboard, currentRow + 1);
				
				chessboard[currentRow][col] = false; //undo or backtrack
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean chessboard[][] = new boolean[4][4];
		
		int count = countQueenPlacement(chessboard, 0);
		
		System.out.println(count);

	}

}
