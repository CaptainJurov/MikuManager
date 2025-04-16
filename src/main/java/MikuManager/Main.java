package MikuManager;

import MikuManager.Telegram.Bot;
import MikuManager.Telegram.EchoBot;

public class Main {
    public static void main (String[] args) {
        Bot bot = new EchoBot(System.getenv("BotToken"));
        bot.start();
    }
}