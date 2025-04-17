package MikuManager.Game.Service;

import MikuManager.Game.GameService;
import MikuManager.Game.PlayerService;

public class ContainerService {
    private GameService gs;
    private PlayerService ps;
    public ContainerService () {
        gs = new GameServiceImpl();
        ps = new PlayersServiceImpl();
    }
    public PlayerService getPlayerService() {return ps;}
    public GameService getGameService() {return gs;}
}
