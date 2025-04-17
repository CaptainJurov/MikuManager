package MikuManager.Game;

import java.util.HashMap;
import java.util.Map;

public class GameService {
    private final Map<Long, Player> players;
    public GameService () {
        players = new HashMap<Long, Player>();
    }
    public boolean checkPlayer( Long id) {
        return players.get(id)!=null;
    }
    public Player getPlayer(Long id) {
        return players.get(id);
    }
}
