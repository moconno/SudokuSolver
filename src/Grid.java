

public class Grid extends Region {
	
	public Grid(int rowStart, int rowEnd, int columnStart, int columnEnd)
	{
			
		for(int i = rowStart; i <= rowEnd; i++)
		{
			for(int j = columnStart; j <= columnEnd; j++)
			{
				cells.add(Board.getCell(i, j));	
				//Remove a value from the possibleValues list
				if(possibleValues.contains(Board.getCell(i, j).getCurrentValue()))
				{
					possibleValues.remove(Board.getCell(i, j).getCurrentValue());
				}					
			}
		}
		
		Board.addRegion(this);
		
		addObservers();
	}
	
}
