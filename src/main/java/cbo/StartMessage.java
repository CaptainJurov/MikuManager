package cbo;

import io.github.natanimn.BotContext;
import io.github.natanimn.handlers.MessageHandler;
import io.github.natanimn.types.Message;

public class StartMessage implements MessageHandler {
    @Override
    public void handle (BotContext botContext, Message message) {
        botContext.reply("Здарова заебал").exec();
    }
}
