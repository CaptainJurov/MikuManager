package MikuManager.Telegram.Handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.handlers.MessageHandler;
import io.github.natanimn.types.Message;

public class OtherMessage implements MessageHandler {
    @Override
    public void handle (BotContext botContext, Message message) {
        botContext.reply("Чё это").exec();
    }
}
