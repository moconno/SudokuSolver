import java.util.ArrayList;
import java.util.List;

public final class Board {
	
	static Cell[][] cells = new Cell[9][9];
	
	static List<Grid> grids = new ArrayList<Grid>();
	
	static List<Row> rows = new ArrayList<Row>();	
	
	static List<Column> columns = new ArrayList<Column>();	
	
	
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

	//Add a grid to the board
	public static void addGrid(Grid grid) 
	{
		grids.add(grid);
		
	}
	
	//return a grid from the board
	public static Grid getGrid(int gridNumber)
	{
		return grids.get(gridNumber - 1);
	}
	
	//Add a row to the board
	public static void addRow(Row row)
	{
		rows.add(row);
	}
	
	//return a row from the board
	public static Row getRow(int rowNumber)
	{
		return rows.get(rowNumber - 1);
	}
	
	//Add a row to the board
	public static void addColumn(Column column)
	{
		columns.add(column);
	}
		
	//return a row from the board
	public static Column getColumn(int columnNumber)
	{
		return columns.get(columnNumber - 1);
	}
	
}
