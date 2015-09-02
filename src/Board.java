import java.util.ArrayList;
import java.util.List;

public final class Board {
	
	static Cell[][] cells = new Cell[9][9];
	
	static List<Region> regions = new ArrayList<Region>();
	
	//Add a cell to the board
	public static void AddCell(int row, int col, Cell cell)
	{
		cells[row][col] = cell;
	}

	//return a cell from the board
	public static Cell getCell(int row, int col) 
	{
		return cells[row][col];
	}
	
	public static void addRegion(Region region)
	{
		regions.add(region);
	}
	
	public static List<Region> getRegions()
	{
		return regions;
	}
	
	public static boolean isSolved()
	{
		boolean isSolved = true;
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				if(cells[i][j].getCurrentValue() == 0)
				{
					isSolved = false;
				}
			}
		}
		return isSolved;
	}
	
	public static void setCellPossibleValues()
	{
		for(int i = 0; i < Board.getRegions().size(); i++)
		{
			for(Region region : Board.getRegions())
			{
				for(Cell cell : region.getCells())
				{
					cell.setPossibleValues(region.getPossibleValues());
				}
			}
		}
	}
	
	public static void printBoard()
	{
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				System.out.print(Board.getCell(i, j).getCurrentValue());
			}
			System.out.println();
		}
	}
	
}
