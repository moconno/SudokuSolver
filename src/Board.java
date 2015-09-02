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
	
}
