

public class Row extends Region{

	public Row(int rowNumber)
	{
		for(int i = 0; i < 9; i++)
		{
			cells.add(Board.getCell(rowNumber, i));
			
			if(possibleValues.contains(Board.getCell(rowNumber, i).getCurrentValue()))
			{
				possibleValues.remove(Board.getCell(rowNumber, i).getCurrentValue());
			}
		}
		Board.addRow(this);
	}
}
