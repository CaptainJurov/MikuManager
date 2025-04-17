package MikuManager.Game;

public interface PlayerService {
    public boolean checkPlayer( Long id);
    public boolean checkPlayer(String name);
    public Player getPlayer(Long id);
    public Player getPlayer(String name);
    public void register(Long id, String name);
}
