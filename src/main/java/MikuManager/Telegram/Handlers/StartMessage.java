package MikuManager.Telegram.Handlers;

import MikuManager.Game.GameService;
import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

public class StartMessage extends AbstractHandler {
    public StartMessage (GameService gs) {
        super(gs);
    }
    @Override
    public void handle (BotContext botContext, Message message) {
        if (gs.ps.checkPlayer(message.from.id)) {
            botContext.reply("Всё заебись не кипишуй").exec();
        }
        else {
            botContext.reply("Тебя еблана нет в базе\n\nКак тебя звать?").exec();
            botContext.setState(message.from.id, "reg");
        }
    }
}
