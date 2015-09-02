import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class Cell extends Observable implements Observer
{
	
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
	
	public void setPossibleValues(List<Integer> values)
	{	
		List<Integer> newValues = new ArrayList<Integer>();
		
		if(possibleValues.isEmpty())
		{
			possibleValues.addAll(values);
		}
		
		for(int i = 0; i < values.size(); i++)
		{
			if(possibleValues.contains(values.get(i))){
				newValues.add(values.get(i));
			}
		}		
		
		possibleValues = newValues;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public List<Integer> getPossibleValues() {
		// TODO Auto-generated method stub
		return possibleValues;
	}
}
