package MikuManager.Telegram;
import MikuManager.Game.GameService;
import MikuManager.Telegram.Handlers.EchoMessage;
import MikuManager.Telegram.Handlers.StartMessage;
import io.github.natanimn.filters.Filter;

public class EchoBot extends Bot{
    GameService gs;
    public EchoBot (String TOKEN) {
        super(TOKEN);
        gs = new GameService();
        addCommand(filter -> filter.commands("start"), new StartMessage(gs)).
        addCommand(Filter::text, new EchoMessage(gs));

    }
}
