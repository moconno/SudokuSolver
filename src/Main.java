import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) 
	{
		String filename = args[0];
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			String line = br.readLine();
			int lineCount = 0;
			while (line != null) 
			{
				Cell cell;
				
				for (int i = 0; i < 9; i++) 
				{
					
					if (line.charAt(i) == ',') 
					{
						cell = new Cell(0);
					} 
					else 
					{
						cell = new Cell((int)Character.getNumericValue(line.charAt(i)));
					}
					
					Board.AddCell(lineCount, i, cell);
				}
				
				lineCount++;
				line = br.readLine();
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		
		new Grid(0, 2, 0, 2);
		new Grid(0, 2, 3, 5);
		new Grid(0, 2, 6, 8);
		
		new Grid(3, 5, 0, 2);
		new Grid(3, 5, 3, 5);
		new Grid(3, 5, 6, 8);
		
		new Grid(6, 8, 0, 2);
		new Grid(6, 8, 3, 5);
		new Grid(6, 8, 6, 8);
		
		for(int i = 0; i < 9; i++)
		{
			new Row(i);
			new Column(i);
		}
		
		for(int i = 0; i < Board.getRegions().size(); i++)
		{
			for(Region region : Board.getRegions())
			{
				for(Cell cell : region.getCells())
				{
					cell.setPossibleValues(region.getPossibleValues());
				}
			}
		}
		
		System.out.println(Board.getCell(7, 3).getPossibleValues());
		
	}

}
