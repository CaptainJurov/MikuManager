package MikuManager.Telegram.Handlers;

import MikuManager.Game.GameService;
import io.github.natanimn.BotContext;
import io.github.natanimn.handlers.MessageHandler;
import io.github.natanimn.types.Message;

public class StartMessage extends AbstractHandler implements MessageHandler {
    public StartMessage (GameService gs) {
        super(gs);
    }
    @Override
    public void handle (BotContext botContext, Message message) {
        if (gs.checkPlayer(message.from.id)) {
            botContext.reply("Всё заебись не кипишуй").exec();
        }
        else {
            botContext.reply("Тебя еблана нет в базе").exec();
        }
    }
}
