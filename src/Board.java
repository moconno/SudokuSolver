
public final class Board {
	
	static Cell[][] cells = new Cell[9][9];
	
	
	public static void AddCell(int row, int col, Cell cell)
	{
		cells[row][col] = cell;
	}


	public static Cell getCell(int row, int col) 
	{
		return cells[row][col];
	}

}
