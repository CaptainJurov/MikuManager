package MikuManager.Game;

import java.util.HashMap;
import java.util.Map;

public class GameService {
    private final Map<Integer, Player> players;
    public GameService () {
        players = new HashMap<Integer, Player>();
    }
    Player getPlayer(Integer id) {
        return players.get(id);
    }
}
