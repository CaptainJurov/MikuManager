package MikuManager.Telegram.Handlers;

import MikuManager.Game.ContainerService;
import io.github.natanimn.BotContext;
import io.github.natanimn.handlers.MessageHandler;
import io.github.natanimn.types.Message;

public abstract class AbstractHandler implements MessageHandler {
    protected ContainerService cs;

    AbstractHandler (ContainerService cs) {
        this.cs = cs;
    }

    @Override
    public void handle (BotContext botContext, Message message) {
    }
}
