package cbo;

import io.github.natanimn.BotClient;
import io.github.natanimn.filters.Filter;
import io.github.natanimn.filters.FilterExecutor;
import io.github.natanimn.handlers.MessageHandler;

import java.util.LinkedHashMap;

public class Bot {
    protected BotClient bot;
    private final LinkedHashMap<FilterExecutor, MessageHandler> commandHandlers = new LinkedHashMap<FilterExecutor, MessageHandler>();
    Bot(String TOKEN) {
        bot = new BotClient.Builder(TOKEN)
                .log(false)
                .limit(10)
                .skipOldUpdates(true)
                .build();
    }
    public Bot addCommand(FilterExecutor fe, MessageHandler mh) {
        commandHandlers.put(fe, mh);
        return this;
    }
    void attach(BotClient bot) {
        commandHandlers.forEach(bot::onMessage);
        bot.onMessage(new OtherMessage());
    }

    void start() {
        attach(bot);
        System.out.println("Запуск бота");
        try {bot.run();}
        catch (Exception e) {
            System.out.println("\033[3;1m"+e.toString());
            throw new RuntimeException(e);
        }
    }
}
