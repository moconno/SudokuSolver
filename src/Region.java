import java.util.ArrayList;
import java.util.List;

public class Region {
	
	protected List<Integer> possibleValues = new ArrayList<Integer>() {{
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		add(6);
		add(7);
		add(8);
		add(9);	
	}};
	
	protected List<Cell> cells = new ArrayList<Cell>();
	
	public Region()
	{
		//Do nothing
	}
	
	public List<Integer> getPossibleValues()
	{
		return possibleValues;
	}
	
	public List<Cell> getCells()
	{
		return cells;
	}
}
