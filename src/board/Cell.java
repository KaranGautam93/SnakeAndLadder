package board;

import snakeladder.Jumper;

public class Cell {

    private int cellNo;

    private Jumper jumper;

    public Cell(int cellNo) {
        this.cellNo = cellNo;
    }

    public int getCellNo() {
        return cellNo;
    }

    public Jumper getJumper() {
        return jumper;
    }

    public void setJumper(Jumper jumper) {
        this.jumper = jumper;
    }
}
