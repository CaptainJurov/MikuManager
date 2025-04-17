package MikuManager.Telegram;

import MikuManager.Telegram.Handlers.OtherMessage;
import io.github.natanimn.BotClient;
import io.github.natanimn.filters.FilterExecutor;
import io.github.natanimn.handlers.MessageHandler;

import java.util.LinkedHashMap;

public class Bot {
    private final BotClient bot;
    private final LinkedHashMap<FilterExecutor, MessageHandler> commandHandlers = new LinkedHashMap<FilterExecutor, MessageHandler>();
    Bot(String TOKEN) {
        bot = new BotClient.Builder(TOKEN)
                .log(false)
                .limit(10)
                .skipOldUpdates(true)
                .build();
    }
    protected Bot addCommand(FilterExecutor fe, MessageHandler mh) {
        commandHandlers.put(fe, mh);
        return this;
    }
    protected void attach(BotClient bot) {
        commandHandlers.forEach(bot::onMessage);
        bot.onMessage(new OtherMessage());
    }

    public void start () {
        attach(bot);
        System.out.println("Запуск бота");
        try {bot.run();}
        catch (Exception e) {
            System.out.println("\033[3;1m"+e.toString());
            throw new RuntimeException(e);
        }
    }
}
