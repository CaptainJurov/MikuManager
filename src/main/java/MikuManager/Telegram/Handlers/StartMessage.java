package MikuManager.Telegram.Handlers;

import MikuManager.Game.Service.ContainerService;
import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

public class StartMessage extends AbstractHandler {
    public StartMessage (ContainerService cs) {
        super(cs);
    }
    @Override
    public void handle (BotContext botContext, Message message) {
        if (cs.getPlayerService().checkPlayer(message.from.id)) {
            botContext.reply("Всё гут не кипишуй").exec();
        }
        else {
            botContext.reply("Тебя нет в базе\n\nКак тебя звать?").exec();
            botContext.setState(message.from.id, "reg");
        }
    }
}
