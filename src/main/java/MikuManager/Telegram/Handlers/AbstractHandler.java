package MikuManager.Telegram.Handlers;

import MikuManager.Game.GameService;
import io.github.natanimn.BotContext;
import io.github.natanimn.handlers.MessageHandler;
import io.github.natanimn.types.Message;

public abstract class AbstractHandler implements MessageHandler {
    protected GameService gs;
    AbstractHandler(GameService gs) {this.gs = gs;}
    @Override
    public void handle (BotContext botContext, Message message) {
    }
}
