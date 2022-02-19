package game;

import board.Board;
import board.Cell;
import player.Player;

import java.util.List;
import java.util.Random;

public class Game {

    public void play(Player player, Board board)
    {
        Random random = new Random();

        int randomMove = random.nextInt(1,6);

        List cells = board.getBoard();

        int currentPosition = cells.indexOf(player.getPosition());

        if (currentPosition + randomMove > 100)
        {
            System.out.println(player.getName()+" can't make a move");
            return;
        }

        Cell updatedCell = (Cell) cells.get(currentPosition + randomMove);

        if(updatedCell.getJumper() != null)
        {
            updatedCell = updatedCell.getJumper().setMove();
        }

        player.setPosition(updatedCell);
        System.out.println(player.getName()+" rolled a "+randomMove+" "+" moved from "+currentPosition+" "+updatedCell.getCellNo());
    }
}
