package board;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List cells;

    public Board()
    {
        cells = new ArrayList<Cell>(100);
        this.addCells();
    }

    private void addCells()
    {
        for (int i = 0; i <= 100;i++)
        {
            cells.add(new Cell(i));
        }
    }

    public List getBoard()
    {
        return this.cells;
    }
}
