package MikuManager.data.repo;

import MikuManager.model.entities.Player;

public interface PlayerRepository {
    Player getPlayer (Long id);
    Player getPlayer (String name);
    void save (Player pl);
}
