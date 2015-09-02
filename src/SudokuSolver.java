
public class SudokuSolver {

	public void Solve() {

		boolean solved = false;
		
		while(solved == false)
		{
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				Cell cell = Board.getCell(i, j);

				if (cell.getPossibleValues().size() == 1) 
				{
					cell.setValue(cell.getPossibleValues().get(0));
					solved = Board.isSolved();
				}
			}
		}
		}
	}

}
