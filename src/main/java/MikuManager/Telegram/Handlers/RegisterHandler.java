package MikuManager.Telegram.Handlers;

import MikuManager.Game.ContainerService;
import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

public class RegisterHandler extends AbstractHandler{
    public RegisterHandler (ContainerService cs) {
        super(cs);
    }

    @Override
    public void handle (BotContext botContext, Message message) {
        if (!cs.getPlayerService().checkPlayer(message.text)) {
            try {
                cs.getPlayerService().register(message.from.id, message.text);
                botContext.reply("Будем знать").exec();
                botContext.clearState(message.from.id);
            } catch (Exception e) {
                botContext.reply("Ошибка").exec();
            }

        }
        else {
            botContext.reply("Такой у нас уже обитает\nпридумай что-то другое").exec();
        }


    }
}
