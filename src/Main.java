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
						cell = new Cell(lineCount, i, 0);
					} 
					else 
					{
						cell = new Cell(lineCount, i, (int)Character.getNumericValue(line.charAt(i)));
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
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				System.out.print(Board.getCell(i, j).currentValue);
			}
			System.out.println();
		}
		
	}

}
