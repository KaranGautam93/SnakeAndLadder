package player;

import board.Cell;

import java.util.ArrayList;
import java.util.List;

public class PlayerStore {
    private List players;

    public PlayerStore()
    {
        players = new ArrayList<Player>();
    }

    public Player addPlayer(String name, Cell position)
    {
        Player player = new Player();
        player.setName(name);
        players.add(player);
        player.setPosition(position);
        return player;
    }

    public List getPlayers() {
        return players;
    }
}
