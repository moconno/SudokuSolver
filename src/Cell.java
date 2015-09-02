import java.util.List;
import java.util.ArrayList;

public class Cell {
	
	Integer currentValue;
	
	boolean hasValidValue;
	
	boolean hasFinalValue;
	
	List<Integer> possibleValues = new ArrayList<Integer>();
	
	public Cell(int value)
	{
		currentValue = value;
		
		if(currentValue != 0)
		{
			hasValidValue = true;
			hasFinalValue = false;
		}
		else
			hasFinalValue = true;
	}
	
	public Integer getCurrentValue()
	{
		return currentValue;
	}
	
	public boolean hasValidValue()
	{
		return hasValidValue();
	}
	
	public boolean hasFinalValue()
	{
		return hasFinalValue();
	}
	
	public void setPossibleValues(List<Integer> possibleValues)
	{
		
	}
}
