package MikuManager.Telegram.Handlers;

import MikuManager.Game.GameService;
import MikuManager.Game.Player;
import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

public class RegisterHandler extends AbstractHandler{
    public RegisterHandler (GameService gs) {
        super(gs);
    }

    @Override
    public void handle (BotContext botContext, Message message) {
        if (!gs.ps.checkPlayer(message.text)) {
            try {
                gs.ps.register(message.from.id, message.text);
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
