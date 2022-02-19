package snakeladder;

import board.Cell;
import player.Player;

public class Snake implements Jumper {
    private Cell startCell;
    private Cell endCell;

    public Snake(Cell startCell, Cell endCell) {
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
