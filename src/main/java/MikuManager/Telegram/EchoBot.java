package MikuManager.Telegram;

import MikuManager.Game.ContainerService;
import MikuManager.Telegram.Handlers.EchoMessage;
import MikuManager.Telegram.Handlers.RegisterHandler;
import MikuManager.Telegram.Handlers.StartMessage;
import io.github.natanimn.filters.Filter;

public class EchoBot extends Bot {
    ContainerService container;

    public EchoBot (String TOKEN) {
        super(TOKEN);
        container = new ContainerService();
        addCommand(filter -> filter.commands("start"), new StartMessage(container));
        addCommand(filter -> filter.state("reg")&&filter.text(), new RegisterHandler(container));
        addCommand(Filter::text, new EchoMessage(container));
    }
}
