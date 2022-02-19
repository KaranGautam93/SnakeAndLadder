package snakeladder;

import board.Cell;
import player.Player;

public class Ladder implements Jumper {
    private Cell startCell;
    private Cell endCell;

    public Ladder(Cell startCell, Cell endCell) {
        this.startCell = startCell;
        this.endCell = endCell;
    }

    @Override
    public Cell setMove() {
        return this.getEndCell();
    }

    public Cell getEndCell() {
        return endCell;
    }
}
