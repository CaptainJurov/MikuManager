package MikuManager.Game.Service;

import MikuManager.Game.Player;
import MikuManager.Game.PlayerService;

import java.util.HashMap;
import java.util.Map;

class PlayersServiceImpl implements PlayerService {
    private final Map<Long, Player> players;

    public PlayersServiceImpl () {
        this.players = new HashMap<Long, Player>();
    }

    public boolean checkPlayer( Long id) {
        return getPlayer(id)!=null;
    }
    public boolean checkPlayer(String name) {
        return getPlayer(name)!=null;
    }
    public Player getPlayer(Long id) {
        return players.get(id);
    }
    public Player getPlayer(String name) {
        for (Long key: players.keySet()) {
            if (players.get(key).getName().toLowerCase() == name.toLowerCase()) return players.get(key);
        }
        return null;
    }
    public void register(Long id, String name) {
        players.put(id, new Player(name));
    }
}
