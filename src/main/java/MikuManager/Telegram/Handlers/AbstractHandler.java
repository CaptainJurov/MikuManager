package MikuManager.Telegram.Handlers;

import MikuManager.Game.GameService;

public abstract class AbstractHandler {
    GameService gs;
    AbstractHandler(GameService gs) {this.gs = gs;}
}
