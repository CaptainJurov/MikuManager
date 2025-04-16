package MikuManager;
public class Main {
    public static void main (String[] args) {
        Bot bot = new EchoBot(System.getenv("BotToken"));
        bot.start();
    }
}