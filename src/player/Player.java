package player;

import board.Cell;

public class Player {
    private String name;

    private Cell position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public boolean won()
    {
        return this.position.getCellNo() == 100;
    }
}
