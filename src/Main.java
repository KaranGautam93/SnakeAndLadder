import board.Board;
import board.Cell;
import game.Game;
import player.Player;
import player.PlayerStore;
import snakeladder.Jumper;
import snakeladder.Ladder;
import snakeladder.Snake;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Board board = new Board();

        List cells = board.getBoard();

        int numberOfSnakes;
        Scanner myInput = new Scanner(System.in );

        System.out.println("Enter number of snakes");
        numberOfSnakes = myInput.nextInt();

        int i = 0;

        int startCell,endCell;

        for(;i < numberOfSnakes; i++)
        {
            System.out.println("Enter head and tail");
            startCell = myInput.nextInt();
            endCell = myInput.nextInt();
            System.out.println("head is: "+startCell+" tail is: "+endCell);
            Cell startCellInst = (Cell) cells.get(startCell);
            Cell endCellInst = (Cell) cells.get(endCell);
            Jumper snake = new Snake(startCellInst, endCellInst);
            startCellInst.setJumper(snake);
        }

        int numberOfLadders;

        numberOfLadders = myInput.nextInt();

        i = 0;

        for(;i < numberOfLadders; i++)
        {

            startCell = myInput.nextInt();
            endCell = myInput.nextInt();
            System.out.println("ladder head is: "+startCell+" tail is: "+endCell);
            Cell startCellInst = (Cell) cells.get(startCell);
            Cell endCellInst = (Cell) cells.get(endCell);
            Jumper ladder = new Ladder(startCellInst, endCellInst);
            startCellInst.setJumper(ladder);
        }

        int numberOfPlayers = myInput.nextInt();

        System.out.println(numberOfPlayers+" -- number of players");

        i = 0;
        PlayerStore store = new PlayerStore();
        myInput.nextLine();

        Cell defaultPosition = (Cell) cells.get(0);

        for(;i < numberOfPlayers;i++)
        {
            String name = myInput.nextLine();
            System.out.println(name+" ---name of player");
            store.addPlayer(name,defaultPosition);
        }

        Game game = new Game();
        Boolean gameOver = false;

        while (true)
        {
            Iterator iterator = store.getPlayers().iterator();


            while (iterator.hasNext())
            {
                Player player = (Player) iterator.next();
                game.play(player,board);

                if (player.won())
                {
                    System.out.println(player.getName()+" wins the game");
                    gameOver = true;
                    break;
                }
            }

            if (gameOver)
            {
                break;
            }
        }

    }
}
