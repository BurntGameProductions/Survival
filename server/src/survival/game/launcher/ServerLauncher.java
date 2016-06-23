package survival.game.launcher;


import survival.game.net.server.GameServer;

/**
 * Created by viktorstrate on 18/04/16.
 */
public class ServerLauncher {
    public static void main(String[] args) {
        new GameServer(5765);
    }
}
