package MikuManager.Telegram.Handlers;

import MikuManager.Game.Service.ContainerService;
import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

public class EchoMessage extends AbstractHandler {
    public EchoMessage (ContainerService cs) {
        super(cs);
    }
    @Override
    public void handle (BotContext botContext, Message message) {
        botContext.reply(message.text).exec();
    }
}
