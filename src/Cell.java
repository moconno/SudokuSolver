import java.util.List;
import java.util.ArrayList;

public class Cell {
	
	public int currentValue;
	
	int rowNumber;
	
	int colNumber;
	
	List<Integer> possibleValues = new ArrayList<Integer>();
	
	public Cell(int row, int col, int value)
	{
		currentValue = value;
		rowNumber = row;
		colNumber = col;
	}

}
