import java.util.ArrayList;
import java.util.List;

public class Column extends Region 
{

	public Column(int columnNumber)
	{	
		for(int i = 0; i < 9; i++)
		{
			cells.add(Board.getCell(i, columnNumber));
			
			if(possibleValues.contains(Board.getCell(i, columnNumber).getCurrentValue()))
			{
				possibleValues.remove(Board.getCell(i, columnNumber).getCurrentValue());
			}
		}
		Board.addColumn(this);
	}
}
