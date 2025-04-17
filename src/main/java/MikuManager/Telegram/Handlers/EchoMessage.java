package MikuManager.Telegram.Handlers;

import MikuManager.Game.GameService;
import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

public class EchoMessage extends AbstractHandler {
    public EchoMessage (GameService gs) {
        super(gs);
    }
    @Override
    public void handle (BotContext botContext, Message message) {
        botContext.reply(message.text).exec();
    }
}
