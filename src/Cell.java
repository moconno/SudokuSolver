import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class Cell extends Observable implements Observer
{
	
	Integer currentValue;
	
	boolean hasFinalValue = false;
	
	List<Integer> possibleValues = new ArrayList<Integer>();
	
	public Cell(int value)
	{
		currentValue = value;
		
		if(currentValue != 0)
		{
			
			hasFinalValue = true;
		}
		else
			hasFinalValue = false;
	}
	
	public Integer getCurrentValue()
	{
		return currentValue;
	}
	
	
	public boolean hasFinalValue()
	{
		return hasFinalValue;
	}
	
	public void setPossibleValues(List<Integer> values)
	{	
		List<Integer> newValues = new ArrayList<Integer>();
		
		if(hasFinalValue == false)
		{
		if(possibleValues.isEmpty())
		{
			possibleValues.addAll(values);
		}
		
		for(int i = 0; i < values.size(); i++)
		{
			if(possibleValues.contains(values.get(i)))
			{
				newValues.add(values.get(i));
			}
		}		
		
		possibleValues = newValues;
		}
	}

	public List<Integer> getPossibleValues() 
	{
		return possibleValues;
	}
	
	public void setValue(Integer value)
	{
		currentValue = value;
		hasFinalValue = true;
		possibleValues.clear();
		setChanged();
		notifyObservers(value);
	}
	
	public void removePossibleValue(Integer number)
	{
		if(possibleValues.size() == 1)
		{
			setValue(possibleValues.get(0));
		}
		
		if(possibleValues.contains(number))
		{
			possibleValues.remove(number);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		removePossibleValue((Integer)arg);
		
	}
}
